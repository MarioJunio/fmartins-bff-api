package br.com.fmartins.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fmartins.constants.Consts;
import br.com.fmartins.exception.CarregamentoLancadoException;
import br.com.fmartins.exception.CarregamentoNaoEncontradoException;
import br.com.fmartins.repository.CarregamentoRepository;
import br.com.fmartins.resource.dto.request.FinalizarCarregamentoDTO;
import br.com.fmartins.resource.dto.request.IniciarCarregamentoDTO;
import br.com.fmartins.resource.dto.response.CarregamentoAgrupadoNaoFinalizadoDTO;
import br.com.fmartins.resource.dto.response.CarregamentoDTO;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CarregamentoService {

	private final Environment env;

	private final CarregamentoRepository carregamentoRepository;

	public void iniciar(BigInteger numCarregamento, final IniciarCarregamentoDTO payload) {

		// obtem o proximo valor sequencia
		Long nextSeqNumCarAgrupado = Arrays.asList(env.getActiveProfiles()).contains(Consts.PROFILE_QA)
				? carregamentoRepository.getNextNumCarAgrupadorQA()
				: carregamentoRepository.getNextNumCarAgrupador();

		payload.setNumCarAgrupado(BigInteger.valueOf(nextSeqNumCarAgrupado));

		carregamentoRepository.iniciar(payload.getDataSaida(), payload.getCodVeiculo(), payload.getKmInicial(),
				payload.getMatricula(), payload.getNumCarAgrupado(), numCarregamento);
	}

	public void finalizar(final FinalizarCarregamentoDTO payload) {
		carregamentoRepository.finalizar(payload.getNumCarregamentosAgrupado(), payload.getKmFinal(),
				payload.getDataRetorno(), payload.getQtCombustivel());
	}

	public boolean verificarLancamento(BigInteger numCarregamento) {

		// subtrai 15 dias da data atual
		LocalDate daysBefore = LocalDate.now().minusDays(15);

		Optional<Long> countLancamentos = carregamentoRepository.verificarLancamento(daysBefore, numCarregamento);

		return countLancamentos.map(count -> count > 0).orElse(false);
	}

	public Optional<CarregamentoDTO> pesquisar(BigInteger numCarregamento) {

		Optional<CarregamentoDTO> opCarregamento = carregamentoRepository.pesquisar(numCarregamento);

		opCarregamento.orElseThrow(() -> new CarregamentoNaoEncontradoException());

		if (verificarLancamento(numCarregamento)) {
			throw new CarregamentoLancadoException();
		}

		return opCarregamento;

	}

	public List<CarregamentoAgrupadoNaoFinalizadoDTO> pesquisarCarregamentosAgrupados(
			BigInteger codMotoristaCarAgrupado) {
		LocalDate daysBefore = LocalDate.now().minusDays(15);

		return carregamentoRepository.pesquisarCarregamentosAgrupados(daysBefore, codMotoristaCarAgrupado);
	}
}

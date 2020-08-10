package br.com.fmartins.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fmartins.repository.CarregamentoRepository;
import br.com.fmartins.resource.dto.request.IniciarCargaDTO;
import br.com.fmartins.resource.dto.response.CarregamentoAgrupadoNaoFinalizadoDTO;
import br.com.fmartins.resource.dto.response.CarregamentoDTO;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CarregamentoService {

	private final CarregamentoRepository carregamentoRepository;

	public boolean verificarLancamento(BigInteger numCarregamento) {

		// subtrai 15 dias da data atual
		LocalDate daysBefore = LocalDate.now().minusDays(15);

		Optional<Long> countLancamentos = carregamentoRepository.verificarLancamento(daysBefore, numCarregamento);

		return countLancamentos.map(count -> count > 0).orElse(false);
	}

	public Optional<CarregamentoDTO> pesquisar(BigInteger numCarregamento) {
		return carregamentoRepository.pesquisar(numCarregamento);
	}

	public void atualizar(BigInteger numCarregamento, IniciarCargaDTO iniciarCargaDTO) {
		carregamentoRepository.atualizar(iniciarCargaDTO.getDataSaida(), iniciarCargaDTO.getCodVeiculo(),
				iniciarCargaDTO.getKmInicial(), iniciarCargaDTO.getMatricula(), iniciarCargaDTO.getNumCarAgrupado(),
				numCarregamento);
	}

	public List<CarregamentoAgrupadoNaoFinalizadoDTO> pesquisarCarregamentosAgrupados(
			BigInteger codMotoristaCarAgrupado) {
		LocalDate daysBefore = LocalDate.now().minusDays(15);

		return carregamentoRepository.pesquisarCarregamentosAgrupados(daysBefore, codMotoristaCarAgrupado);
	}
}

package br.com.fmartins.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fmartins.exception.EmpregadoNotFoundException;
import br.com.fmartins.model.Veiculo;
import br.com.fmartins.repository.EmpregadoRepository;
import br.com.fmartins.repository.VeiculoRepository;
import br.com.fmartins.resource.dto.response.EmpregadoDTO;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class EmpregadoService {

	private final EmpregadoRepository empregadoRepository;

	private final VeiculoRepository veiculoRepository;

	public EmpregadoDTO pesquisar(Long matricula) {

		Optional<EmpregadoDTO> empregadoOp = empregadoRepository.buscarPorMatricula(matricula);

		return empregadoOp.map(e -> {
			
			// busca a placa do veiculo vinculado ao empregado
			if (e.getCodVeiculo() != null) {
				Optional<Veiculo> veiculoOp = veiculoRepository.findById(e.getCodVeiculo());

				e.setPlacaVeiculo(veiculoOp.isPresent() ? veiculoOp.get().getPlaca() : "");
			}

			return e;
		}).orElseThrow(() -> new EmpregadoNotFoundException());
	}
}

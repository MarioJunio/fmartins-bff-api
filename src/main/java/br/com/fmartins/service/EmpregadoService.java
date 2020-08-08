package br.com.fmartins.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fmartins.repository.EmpregadoRepository;
import br.com.fmartins.resource.dto.response.EmpregadoDTO;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class EmpregadoService {
	
	private final EmpregadoRepository empregadoRepository;
	
	public Optional<EmpregadoDTO> pesquisar(Long matricula) {
		return empregadoRepository.buscarPorMatricula(matricula);
	}
}

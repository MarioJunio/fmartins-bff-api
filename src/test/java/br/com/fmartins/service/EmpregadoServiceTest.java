package br.com.fmartins.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.fmartins.exception.EmpregadoNotFoundException;
import br.com.fmartins.model.Veiculo;
import br.com.fmartins.repository.EmpregadoRepository;
import br.com.fmartins.repository.VeiculoRepository;
import br.com.fmartins.resource.dto.response.EmpregadoDTO;

public class EmpregadoServiceTest {

	@Mock
	EmpregadoRepository empregadoRepository;

	@Mock
	VeiculoRepository veiculoRepository;

	@InjectMocks
	EmpregadoService empregadoService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);

		EmpregadoDTO empregadoDTO = EmpregadoDTO.builder().matricula(1L).nomeGuerra("Mario").codVeiculo(34L)
				.placaVeiculo("FSI-1664").build();

		Veiculo veiculo = new Veiculo();
		veiculo.setCodVeiculo(34L);
		veiculo.setPlaca("FSI-1664");

		when(empregadoRepository.buscarPorMatricula(1L)).thenReturn(Optional.ofNullable(empregadoDTO));

		when(veiculoRepository.findById(34L)).thenReturn(Optional.ofNullable(veiculo));
	}

	@Test
	public void pesquisarTest() {

		EmpregadoDTO empregadoDTO = empregadoService.pesquisar(1L);

		assertEquals(empregadoDTO.getMatricula(), 1L);

	}

	@Test
	public void pesquisarTestException() {

		assertThrows(EmpregadoNotFoundException.class, () -> {
			empregadoService.pesquisar(2L);
		});

	}
}

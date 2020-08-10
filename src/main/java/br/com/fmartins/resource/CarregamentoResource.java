package br.com.fmartins.resource;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmartins.resource.dto.request.FinalizarCargaDTO;
import br.com.fmartins.resource.dto.request.IniciarCargaDTO;
import br.com.fmartins.resource.dto.response.CarregamentoAgrupadoNaoFinalizadoDTO;
import br.com.fmartins.resource.dto.response.CarregamentoDTO;
import br.com.fmartins.service.CarregamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/carregamentos")
@RequiredArgsConstructor
@Slf4j
public class CarregamentoResource {

	private final CarregamentoService carregamentoService;

	@GetMapping("/verificar-lancamento/{numCarregamento}")
	public ResponseEntity<Boolean> verificarLancamento(@PathVariable BigInteger numCarregamento) {
		boolean isCarregamentoIniciado = carregamentoService.verificarLancamento(numCarregamento);

		return isCarregamentoIniciado ? ResponseEntity.ok().body(true) : ResponseEntity.notFound().build();
	}

	@GetMapping("/{numCarregamento}")
	public ResponseEntity<CarregamentoDTO> pesquisar(@PathVariable BigInteger numCarregamento) {
		Optional<CarregamentoDTO> opCarregamento = carregamentoService.pesquisar(numCarregamento);

		return opCarregamento.isPresent() ? ResponseEntity.ok(opCarregamento.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping("/agrupados-nao-finalizados/{matricula}")
	public ResponseEntity<List<CarregamentoAgrupadoNaoFinalizadoDTO>> pesquisarCargasNaoFinalizadasPorUsuario(
			@PathVariable BigInteger matricula) {
		
		log.info("/agrupados-nao-finalizados/{}", matricula);

		List<CarregamentoAgrupadoNaoFinalizadoDTO> carregamentosAgrupados = carregamentoService
				.pesquisarCarregamentosAgrupados(matricula);

		return !carregamentosAgrupados.isEmpty() ? ResponseEntity.ok(carregamentosAgrupados)
				: ResponseEntity.notFound().build();
	}

	@PutMapping("/iniciar-carga/{numCarregamento}")
	public void iniciarCarga(@PathVariable BigInteger numCarregamento, @RequestBody IniciarCargaDTO payload) {
		log.info("/iniciar-carga/{}", numCarregamento);
		log.info("{}", payload);

		carregamentoService.atualizar(numCarregamento, payload);
	}

	@PutMapping("/finalizar-carga/{numCarregamento}")
	public void finalizarCarga(@PathVariable BigInteger numCarregamento,
			@RequestBody FinalizarCargaDTO finalizarCargaDTO) {

	}
}

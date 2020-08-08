package br.com.fmartins.resource;

import java.math.BigInteger;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmartins.resource.dto.request.FinalizarCargaDTO;
import br.com.fmartins.resource.dto.request.IniciarCargaDTO;
import br.com.fmartins.resource.dto.response.CarregamentoAgrupadoNãoFinalizadoDTO;
import br.com.fmartins.resource.dto.response.CarregamentoDTO;

@RestController
@RequestMapping("/carregamentos")
public class CarregamentoResource {

	@GetMapping("/verificar-lancamento/{numCarregamento}")
	public boolean verificarLancamento(@PathVariable BigInteger numCarregamento) {
		return false;
	}

	@GetMapping("/{numCarregamento}")
	public ResponseEntity<List<CarregamentoDTO>> pesquisar(@PathVariable BigInteger numCarregamento) {
		return null;
	}

	@GetMapping("/agrupados-nao-finalizados/{matricula}")
	public ResponseEntity<List<CarregamentoAgrupadoNãoFinalizadoDTO>> pesquisarCargasNaoFinalizadasPorUsuario(
			@PathVariable String matricula) {

	}

	@PutMapping("/iniciar-carga")
	public void iniciarCarga(@RequestBody IniciarCargaDTO payload) {

	}

	@PutMapping("/finalizar-carga/{numCarregamento}")
	public void finalizarCarga(@PathVariable BigInteger numCarregamento, @RequestBody FinalizarCargaDTO finalizarCargaDTO) {
		
	}
}

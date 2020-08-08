package br.com.fmartins.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmartins.resource.dto.response.EmpregadoDTO;

@RestController
@RequestMapping("/empregados")
public class EmpregadoResource {

	@GetMapping("/{matricula}")
	public ResponseEntity<EmpregadoDTO> pesquisar(@PathVariable String matricula) {
		return ResponseEntity.ok(EmpregadoDTO.builder().matricula(1L).build());
	}

}

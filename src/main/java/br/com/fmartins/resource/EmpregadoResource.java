package br.com.fmartins.resource;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmartins.resource.dto.response.EmpregadoDTO;
import br.com.fmartins.service.EmpregadoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/empregados")
@RequiredArgsConstructor
public class EmpregadoResource {

	private final EmpregadoService empregadoService;
	
	@GetMapping("/{matricula}")
	public ResponseEntity<EmpregadoDTO> pesquisar(@PathVariable Long matricula) {
		Optional<EmpregadoDTO> opEmpregadoDTO = empregadoService.pesquisar(matricula);
		
		return opEmpregadoDTO.isPresent() ? ResponseEntity.ok(opEmpregadoDTO.get()) : ResponseEntity.notFound().build();
	}

}

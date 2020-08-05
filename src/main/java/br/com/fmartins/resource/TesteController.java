package br.com.fmartins.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmartins.model.Empregado;

@RestController
public class TesteController {

	private Empregado pc = new Empregado();
	
	@GetMapping("/")
	public String teste() {
		return "oi";
	}
	
}

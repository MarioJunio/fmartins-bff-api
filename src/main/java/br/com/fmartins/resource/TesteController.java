package br.com.fmartins.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

	@GetMapping("/")
	public String teste() {
		return "oi";
	}
	
}

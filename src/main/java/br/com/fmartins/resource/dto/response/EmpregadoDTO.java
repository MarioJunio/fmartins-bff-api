package br.com.fmartins.resource.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class EmpregadoDTO {

	private Long matricula;
	private String nomeGuerra;
	private Long codVeiculo;
	private String placaVeiculo;

	public EmpregadoDTO(Long matricula, String nomeGuerra, Long codVeiculo) {
		this.matricula = matricula;
		this.nomeGuerra = nomeGuerra;
		this.codVeiculo = codVeiculo;
	}
}

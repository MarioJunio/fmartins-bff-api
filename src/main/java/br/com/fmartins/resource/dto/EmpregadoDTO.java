package br.com.fmartins.resource.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpregadoDTO {

	private Long matricula;
	private String nomeGuerra;
}

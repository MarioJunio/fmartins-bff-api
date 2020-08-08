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
}

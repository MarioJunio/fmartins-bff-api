package br.com.fmartins.resource.dto.request;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FinalizarCargaDTO {
	
	private Double kmFinal;
	private LocalDate dataRetorno;
	private Double qtCombustivel;
}

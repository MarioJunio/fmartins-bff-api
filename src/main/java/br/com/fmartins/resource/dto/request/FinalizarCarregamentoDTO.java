package br.com.fmartins.resource.dto.request;

import java.math.BigInteger;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FinalizarCarregamentoDTO {
	
	private Double kmFinal;
	private LocalDate dataRetorno;
	private Double qtCombustivel;
	private BigInteger numCarAgrupado;
}

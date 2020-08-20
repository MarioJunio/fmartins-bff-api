package br.com.fmartins.resource.dto.request;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FinalizarCarregamentoDTO {
	
	private Double kmFinal;
	private LocalDateTime dataRetorno;
	private Double qtCombustivel;
	private List<BigInteger> numCarregamentosAgrupado;
}

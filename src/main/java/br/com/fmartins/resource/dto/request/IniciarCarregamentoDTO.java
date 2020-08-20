package br.com.fmartins.resource.dto.request;

import java.math.BigInteger;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IniciarCarregamentoDTO {

	private LocalDateTime dataSaida;
	private BigInteger codVeiculo;
	private Double kmInicial;
	private BigInteger matricula;
	private BigInteger numCarAgrupado;

}

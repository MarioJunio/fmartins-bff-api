package br.com.fmartins.resource.dto.request;

import java.math.BigInteger;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IniciarCargaDTO {
	
	private BigInteger numCarregamento;
	private LocalDate dataSaida;
	private BigInteger codVeiculo;
	private Double kmInicial;
	private BigInteger matricula;
}

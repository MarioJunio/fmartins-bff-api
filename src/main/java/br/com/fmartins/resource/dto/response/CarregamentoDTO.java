package br.com.fmartins.resource.dto.response;

import java.math.BigInteger;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarregamentoDTO {
	
	private BigInteger numcar;
	private String destino;
	private Double pesoTotal;
	private Double volumeTotal;
	private LocalDate dataSaidaVeiculo;
	private BigInteger codVeiculoCarAgrupado;
	private Double kmInicial;
	private BigInteger codMotoristaCarAgrupado;
	private BigInteger numCarAgrupado;
	
}

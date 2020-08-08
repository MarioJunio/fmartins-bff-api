package br.com.fmartins.resource.dto.response;

import java.math.BigInteger;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarregamentoAgrupadoNãoFinalizadoDTO {
	
	private BigInteger numCarAgrupado;
	private LocalDate dataSaidaVeiculo;
	private Double kmInicial;
	private Double pesoTotal;
	private Double volumeTotal;
}

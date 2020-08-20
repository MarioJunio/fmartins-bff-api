package br.com.fmartins.resource.dto.response;

import java.math.BigInteger;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarregamentoAgrupadoNaoFinalizadoDTO {
	
	private BigInteger numCarAgrupado;
	private LocalDateTime dataSaidaVeiculo;
	private Double kmInicial;
	private Double pesoTotal;
	private Double volumeTotal;
}

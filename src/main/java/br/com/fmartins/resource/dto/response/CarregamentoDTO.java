package br.com.fmartins.resource.dto.response;

import java.math.BigInteger;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarregamentoDTO {

	private BigInteger numCar;
	private String destino;
	private Double pesoTotal;
	private Double volumeTotal;
	private LocalDateTime dataSaidaVeiculo;
	private BigInteger codVeiculoCarAgrupado;
	private Double kmInicial;
	private BigInteger codMotoristaCarAgrupado;
	private BigInteger numCarAgrupado;

	public CarregamentoDTO(BigInteger numCar, String destino, Double pesoTotal, Double volumeTotal) {
		this.numCar = numCar;
		this.destino = destino;
		this.pesoTotal = pesoTotal;
		this.volumeTotal = volumeTotal;
	}
}

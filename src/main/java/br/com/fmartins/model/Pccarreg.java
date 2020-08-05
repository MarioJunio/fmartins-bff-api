package br.com.fmartins.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(schema = "FMARTINS", name = "PCCARREG")
public class Pccarreg implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long numcar;
	
	@Column(name = "DTSAIDA")
	private LocalDate dataSaida;
	
	@Column(name = "CODMOTORISTA")
	private Long codigoMotorista;
	
	@Column(name = "CODVEICULO")
	private Integer codigoVeiculo;
	
	@Column(name = "TOTPESO")
	private Double pesoTotal;
	
	@Column(name = "TOTVOLUME")
	private Double volumeTotal;
	
	@Column(name = "VLTOTAL")
	private BigDecimal valorTotal;
	
}

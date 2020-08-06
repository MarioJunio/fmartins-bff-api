package br.com.fmartins.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(schema = "FMARTINS", name = "PCPERFILVEICULO")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PerfilVeiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "CODPERFILVEICULO")
	private Long codigo;
	
	@Column(name="DSCPERFILVEICULO")
	private String dscPerfilVeiculo;
	
	@Column(name="QTDMINIMA")
	private Long qtdMinima;
	
	@Column(name="QTDMAXIMA")
	private Long qtdMaxima;
}

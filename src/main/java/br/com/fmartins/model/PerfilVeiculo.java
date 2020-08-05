package br.com.fmartins.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "FMARTINS", name = "PCPERFILVEICULO")
public class PerfilVeiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long codperfilveiculo;
	
	@Column(name="DSCPERFILVEICULO")
	private String dscPerfilVeiculo;
	
	@Column(name="QTDMINIMA")
	private Long qtdMinima;
	
	@Column(name="QTDMAXIMA")
	private Long qtdMaxima;
}

package br.com.fmartins.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(schema = "FMARTINS", name = "PCTIPOVEICULO")
public class TipoVeiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODTIPOVEICULO")
	@EqualsAndHashCode.Include
	private Long codigo;

	@Column(name = "DSCTIPOVEICULO")
	private String dscTipoVeiculo;

	@Column(name = "CODPERFILVEICULO")
	private PerfilVeiculo codPerfilVeiculo;

	@Column(name = "TIPODIARIA")
	private String tipoDiaria;

	@Column(name = "VLDIARIA")
	private BigDecimal vlDiaria;

	@Column(name = "TIPOTARIFAKGTRANSPORTADO")
	private String tipoTarifaKgTransportado;

	@Column(name = "VLTARIFAKGTRANSPORTADO")
	private BigDecimal vlTarifaKgTranspotado;

	@Column(name = "TIPOTARIFAVOLTRANSPORTADO")
	private String tipoTarifaVolTransportado;

	@Column(name = "VLTARIFAVOLTRANSPORTADO")
	private BigDecimal vlTarifaVolTransportado;

	@Column(name = "TIPOTARIFAQTDENTREGA")
	private String tipoTarifaQtdEntrega;

	@Column(name = "VLTARIFAQTDENTREGA")
	private BigDecimal vlTarifaQtdEntrega;

	@Column(name = "PERIODOINIVIGENCIA")
	private LocalDate periodoIniVigencia;

	@Column(name = "PERIODOFIMVIGENCIA")
	private LocalDate periodoFimVigencia;

	@Column(name = "COMISSAOINCIDESOBRE")
	private String comissaoIncideSobre;

	@Column(name = "PONDERACAOTARIFAPESO")
	private Double poderacaoTarifaPeso;

	@Column(name = "PONDERACAOTARIFAVOLUME")
	private Double poderacaoTarifaVolume;

	@Column(name = "PONDERACAOTARIFAENTREGA")
	private Double ponderacaoTarifaEntrega;

}

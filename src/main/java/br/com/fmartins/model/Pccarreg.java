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
	
	@Column(name="DTFECHA")
	private LocalDate dataFechamento;
	
	@Column(name="DESTINO")
	private String destino;
	
	@Column(name="NUMNOTAS")
	private Long numNotas;
	
	@Column(name="CODCAIXA")
	private Long codCaixa;
	
	@Column(name="PERCOM")
	private double perCom;
	
	@Column(name="NUMENT")
	private Integer numEnt;
	
	@Column(name="NUMCID")
	private Integer numCid;
	
	@Column(name="PREVCHEG")
	private LocalDate prevChegada;
	
	@Column(name="DTRETORNO")
	private LocalDate dataRetorno;
	
	@Column(name="CODCONF")
	private Long codConf;
	
	@Column(name="DT_CANCEL")
	private LocalDate dataCancel;
	
	@Column(name="DATAMON")
	private LocalDate dataMon;
	
	@Column(name="CODFUNCMON")
	private Long codFuncMon;
	
	@Column(name="DATAMAPA")
	private LocalDate dataMapa;
	
	@Column(name="CODFUNCMAPA")
	private Long codFuncMapa;
	
	@Column(name="NUMVIASMAPA")
	private Integer numViasMapa;
	
	@Column(name="DTCAIXA")
	private LocalDate dataCaixa;
	
	@Column(name="DTFAT")
	private LocalDate dataFat;
	
	@Column(name="CODFUNCFAT")
	private Long codFuncFat;
	
	@Column(name="CODFUNCCANCEL")
	private Long codFuncCancel;
	
	@Column(name="DATACONF")
	private LocalDate dataConfirmacao;
	
	@Column(name="QTITENS")
	private BigDecimal qtItens;
	
	@Column(name="OBSFATUR")
	private String observacaoFatur;
	
	@Column(name="TIPOCARGA")
	private String tipoCarga;
	
	@Column(name="KMINICIAL")
	private double kmInicial;
	
	@Column(name="KMFINAL")
	private double kmFinal;
	
	@Column(name="DTSAIDAVEICULO")
	private LocalDate dataSaidaVeiculo;
	
	@Column(name="CODROTAPRINC")
	private BigDecimal codRotaPrincipal;
	
	@Column(name="NUMDIARIAS")
	private BigDecimal numeroDiarias;
	
	@Column(name="CODFUNCAJUD")
	private BigDecimal codFuncaJud;
}

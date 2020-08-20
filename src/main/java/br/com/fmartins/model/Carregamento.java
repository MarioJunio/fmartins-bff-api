package br.com.fmartins.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(schema = "FMARTINS", name = "PCCARREG")
public class Carregamento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NUMCAR")
	@EqualsAndHashCode.Include
	private BigInteger numCar;
	
	@Column(name = "DTSAIDA")
	private LocalDate dataSaida;
	
	@Column(name = "CODMOTORISTA")
	private BigInteger codigoMotorista;
	
	@Column(name = "CODVEICULO")
	private BigInteger codigoVeiculo;
	
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
	private Long numeroNotas;
	
	@Column(name="CODCAIXA")
	private BigInteger codigoCaixa;
	
	@Column(name="PERCOM")
	private double perCom;
	
	@Column(name="NUMENT")
	private BigInteger numEnt;
	
	@Column(name="NUMCID")
	private BigInteger numCid;
	
	@Column(name="PREVCHEG")
	private LocalDate prevChegada;
	
	@Column(name="DTRETORNO")
	private LocalDateTime dataRetorno;
	
	@Column(name="CODCONF")
	private BigInteger codConf;
	
	@Column(name="DT_CANCEL")
	private LocalDate dataCancel;
	
	@Column(name="DATAMON")
	private LocalDate dataMon;
	
	@Column(name="CODFUNCMON")
	private BigInteger codFuncMon;
	
	@Column(name="DATAMAPA")
	private LocalDate dataMapa;
	
	@Column(name="CODFUNCMAPA")
	private BigInteger codFuncMapa;
	
	@Column(name="NUMVIASMAPA")
	private Integer numViasMapa;
	
	@Column(name="DTCAIXA")
	private LocalDate dataCaixa;
	
	@Column(name="DTFAT")
	private LocalDate dataFat;
	
	@Column(name="CODFUNCFAT")
	private BigInteger codFuncFat;
	
	@Column(name="CODFUNCCANCEL")
	private BigInteger codFuncCancel;
	
	@Column(name="DATACONF")
	private LocalDate dataConfirmacao;
	
	@Column(name="QTITENS")
	private BigInteger qtItens;
	
	@Column(name="OBSFATUR")
	private String observacaoFatur;
	
	@Column(name="TIPOCARGA")
	private String tipoCarga;
	
	@Column(name="KMINICIAL")
	private Double kmInicial;
	
	@Column(name="KMFINAL")
	private Double kmFinal;
	
	@Column(name="DTSAIDAVEICULO")
	private LocalDateTime dataSaidaVeiculo;
	
	@Column(name="CODROTAPRINC")
	private BigInteger codRotaPrincipal;
	
	@Column(name="NUMDIARIAS")
	private BigInteger numeroDiarias;
	
	@Column(name="CODFUNCAJUD")
	private BigInteger codFuncaJud;
	
	@Column(name="PAGCOMMOTMIN")
	private String pagComMotMin;
	
	@Column(name="VLVALERETENCAO")
	private BigDecimal vlValeRetencao;
	
	@Column(name="HORAFECHA")
	private Integer horaFecha;
	
	@Column(name="MINUTOFECHA")
	private Integer minutoFecha;
	
	@Column(name="NUMCAROL")
	private BigInteger numCarol;
	
	@Column(name="CONHECFRETE")
	private String conhecFrete;
	
	@Column(name="NUMCAROPERLOG")
	private BigInteger numCarOperLog;
	
	@Column(name="DTFECHACOMISSMOT")
	private LocalDate dtFechaComissMot;
	
	@Column(name="QTCOMBUSTIVEL")
	private Double qtCombustivel;
	
	@Column(name="BALCAOBAIXADO")
	private String balcaoBaixado;
	
	@Column(name="OBSDESTINO")
	private String obsDestino;
	
	@Column(name="VLFRETE")
	private BigDecimal valorFrete;
	
	@Column(name="ABASTECIDO")
	private String abastecido;
	
	@Column(name="MAPAGERADOWMS")
	private String mapaGeradoWms;
	
	@Column(name="CONHECGERADO")
	private String conhecGerado;
	
	@Column(name="MAPAGERADOWMSPAL")
	private String	mapaGeradoWmsPal;
	
	@Column(name="HORAMON")
	private Integer horaMon;
	
	@Column(name="MINUTOMON")
	private Integer minutoMon;
	
	@Column(name="QTCAIXAS")
	private Integer qtCaixas;
	
	@Column(name="NUMCARWMS")
	private BigInteger numCarWms;
	
	@Column(name="VLCOMBUSTIVEL")
	private BigDecimal vlCombustivel;
	
	@Column(name="DTINICIOCHECKOUT")
	private LocalDate dtInicioCheckout;
	
	@Column(name="DTFIMCHECKOUT")
	private LocalDate dtFimCheckout;
	
	@Column(name="DATAHORAMAPA")
	private LocalDate dataHoraMapa;
	
	@Column(name="CARGASECUNDARIA")
	private String cargaSecundaria;
	
	@Column(name="NUMLANCDIARIA")
	private Long numLancDiaria;
	
	@Column(name="NUMCARBROKER")
	private BigInteger numCarBroker;
	
	@Column(name="PERCOMTERC")
	private Double perComTerc;
	
	@Column(name="PERCOMAJUD")
	private Double perComAjud;
	
	@Column(name="TIPOCOMISSAO")
	private String tipoComissao;
	
	@Column(name="VLDIARIA")
	private BigDecimal valorDiaria;
	
	@Column(name="VLDESPAJUDANTE")
	private BigDecimal valDespAjudante;
	
	@Column(name="LACRE")
	private String lacre;
	
	@Column(name="GEOVOLUMETOTAL")
	private BigInteger geoVolumeTotal;
	
	@Column(name="FROTA_PESO")
	private Integer frotaPeso;
	
	@Column(name="DATACONFFIM")
	private LocalDate dataConfFim;
	
	@Column(name="DTINICIALPEND")
	private LocalDate dataInicialPend;
	
	@Column(name="DTFINALPEND")
	private LocalDate dataFinalPend;
	
	@Column(name="SEGURADA")
	private String segurada;
	
	@Column(name="CODFILIALSAIDA")
	private String codFilialSaida;
	
	@Column(name="CODFUNCMAPACARAGRUPADO")
	private BigInteger codFuncMapaCarAgrupado;
	
	@Column(name="DATAHORAMAPACARAGRUPADO")
	private LocalDate dataHoraMapaCarAgrupado;
	
	@Column(name="NUMCARAGRUPADO")
	private BigInteger numCarAgrupado;
	
	@Column(name="NUMVIASCARAGRUPADO")
	private Integer numViasCarAgrupado;
	
	@Column(name="CODMOTORISTACARAGRUPADO")
	private BigInteger codMotoristaCarAgrupado;
	
	@Column(name="CODVEICULCARAGRUPADO")
	private BigInteger codVeiculoCarAgrupado;
	
	@Column(name="DATACARAGRUPADO")
	private LocalDate dataCarAgrupado;
	
	@Column(name="TRANSFERENCIA")
	private String transferencia;
	
	@Column(name="LANCTOCPAGARFECHCOMISS414")
	private String lanctoPagrFechComiss414;
	
	@Column(name="DTFECHACOMMOTTRANSB")
	private LocalDate dataFechaComMotTransb;
	
	@Column(name="DTFECHACOMAJUDTRANSB")
	private LocalDate dataFechaComAjudTransb;
	
	@Column(name="DTFECHACOMAJUD")
	private LocalDate dataFechaComAjud;
	
	@Column(name="CODMOTTRANSBORDO")
	private BigInteger codMotTransbordo;
	
	@Column(name="CODAJUDTRANSBORDO")
	private BigInteger codAjudTransbordo;
	
	@Column(name="OBSDESTINOAGRUP")
	private String obsDestinoAgrupado;
	
	@Column(name="DESTINOAGRUP")
	private String destnoAgrupado;
	
	@Column(name="OBSACERTO")
	private String obsAcerto;
	
	@Column(name="PERCFRETERETIDO")
	private Double percFreteRetido;
	
	@Column(name="VLFIXO")
	private BigDecimal vlFixo;
	
	@Column(name="VLPED")
	private BigDecimal vlPed;
	
	@Column(name="PERGRIS")
	private Double perGris;
	
	@Column(name="VALORKG")
	private BigDecimal valorKg;
	
	@Column(name="CODFUNCCONF")
	private BigInteger codFuncConf;
	
	@Column(name="LANCARDESPDESCFINAUTOMATIC")
	private String lancarDespDescFinAutomatico = "N";
	
	@Column(name="CODFUNCSAIDACAR")
	private BigInteger codFuncSaidaCar;
	
	@Column(name="CODFUNCRETORNOCAR")
	private BigInteger codFuncRetornoCar;
	
	@Column(name="SEGUNDOMON")
	private Short segundoMon;
	
	@Column(name="CODVEICULO1")
	private BigInteger codVeiculo01;
	
	@Column(name="CODVEICULO2")
	private BigInteger codVeiculo02;
	
	@Column(name="NUMONUCARGA")
	private String numOnuCarga;
	
	@Column(name="NOMEAPROPRIADOCARGA")
	private String nomeApropriadoCarga;
	
	@Column(name="DIVISAOCARGA")
	private String divisaoCarga;
	
	@Column(name="GRUPOEMBCARGA")
	private String grupoEmbCarga;
	
	@Column(name="QTDTOTALPRODCARGA")
	private String qtdTotalProdCarga;
	
	@Column(name="PONTOFUGORCARGA")
	private String pontoFugorCarga;
	
	@Column(name="SEGUNDOSFECHA")
	private Short segundosFecha;
	
	@Column(name="CODFUNCAJUD2")
	private BigInteger codFuncaJud2;
	
	@Column(name="CODFUNCAJUD3")
	private BigInteger codFuncaoJud3;
	
	@Column(name="DTEXPORTACAO")
	private LocalDate dataExportacao;
	
	@Column(name="OBSEXPORTACAO")
	private String obsExportacao;
	
	@Column(name="IDINTEGRACAOMYFROTA")
	private String idIntegracaoMyFrota;
	
	@ManyToOne
	@JoinColumn(name = "CODTIPOVEICULO")
	private TipoVeiculo codTipoVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "CODPERFILVEICULO")
	private PerfilVeiculo codPerfilVeiculo;
	
	@Column(name="TIPOCALCULOCOMISSAOFRETISTA")
	private String tipoCalculoComissaoFretista;
	
	@Column(name="CODFUNTIPOCALCCOMISSAOFRETISTA")
	private BigInteger codFunTipoCalcComissaoFretista;
	
	@Column(name="LIBERA_RETAGUARDA")
	private String liberaRetaguarda;
	
	@Column(name="CODFUNCLIBEROURET")
	private BigInteger codFuncLiberouRet;
	
	@Column(name="DATALIBEROURET")
	private LocalDate dataLiberouRet;
	
	@Column(name="NUMCARMANIFCONCLUIDOFV")
	private String NumCarManifConcluidoFV = "N";
	
	@Column(name="SB_FILIAL")
	private String sbFilial;
	
	@Column(name="CODFUNCFECHA")
	private BigInteger codFuncFecha;
	
	@Column(name="SB_DTABAST")
	private LocalDate sbDataBast;
	
	@Column(name="SB_SELWMS")
	private Short sbSelwms = 0;
	
	@Column(name="SB_DTWMS")
	private LocalDate sbDtwms;
	
	@Column(name="SB_SELABAST")
	private Short sbSelaBast = 0;
	
	@Column(name="SB_SEQABAST")
	private BigInteger sbSeqAbast = BigInteger.ZERO;
	
	@Column(name="SB_SEQHORACARGA")
	private BigInteger sbSeqHoraCarga = BigInteger.ZERO;
	
	@Column(name="OBSFRETE")
	private String obsFrete;
	
	@Column(name="LANCIMPPRIMPARC")
	private String lancImpprimParc;
	
	@Column(name="NUMONDA")
	private double numOnda;
	
	@Column(name="ORDEMSEP")
	private BigInteger ordemSep;
	
	@Column(name="ORDEMCONF")
	private BigInteger ordemConf;
	
	@Column(name="DTMXSALTER")
	private LocalDate dtMxSalter;
	
	@Column(name="CODVEICULOCARREG")
	private BigInteger codVeiculoCarreg;
	
	@Column(name="IDSOFITVIEW")
	private String idSofitView;
	
	@Column(name="ULTIMASITUACAOCFAT")
	private String ultimaSituacaoCfat;
	
	@Column(name="DATAULTIMASITUACAOCFAT")
	private LocalDate dataUltimaSituacaoFat;
	
	@Column(name="CLIENTEPRESENTE")
	private String clientePresente;
	
	
}

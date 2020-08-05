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
public class Carregamento implements Serializable {
	
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
	private Long numeroNotas;
	
	@Column(name="CODCAIXA")
	private Long codigoCaixa;
	
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
	
	@Column(name="PAGCOMMOTMIN")
	private String pagComMotMin;
	
	@Column(name="VLVALERETENCAO")
	private BigDecimal vlValeRetencao;
	
	@Column(name="HORAFECHA")
	private Integer horaFecha;
	
	@Column(name="MINUTOFECHA")
	private Integer minutoFecha;
	
	@Column(name="NUMCAROL")
	private BigDecimal numCarol;
	
	@Column(name="CONHECFRETE")
	private String conhecFrete;
	
	@Column(name="NUMCAROPERLOG")
	private BigDecimal numCarOperLog;
	
	@Column(name="DTFECHACOMISSMOT")
	private LocalDate dtFechaComissMot;
	
	@Column(name="QTCOMBUSTIVEL")
	private BigDecimal qtCombustivel;
	
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
	private BigDecimal qtCaixas;
	
	@Column(name="NUMCARWMS")
	private Long numCarWms;
	
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
	private BigDecimal numCarBroker;
	
	@Column(name="PERCOMTERC")
	private BigDecimal perComTerc;
	
	@Column(name="PERCOMAJUD")
	private BigDecimal perComAjud;
	
	@Column(name="TIPOCOMISSAO")
	private String tipoComissao;
	
	@Column(name="VLDIARIA")
	private BigDecimal valorDiaria;
	
	@Column(name="VLDESPAJUDANTE")
	private BigDecimal valDespAjudante;
	
	@Column(name="LACRE")
	private String lacre;
	
	@Column(name="GEOVOLUMETOTAL")
	private BigDecimal GeoVolumeTotal;
	
	@Column(name="FROTA_PESO")
	private BigDecimal frotaPeso;
	
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
	private BigDecimal codFuncMapaCarAgrupado;
	
	@Column(name="DATAHORAMAPACARAGRUPADO")
	private LocalDate dataHoraMapaCarAgrupado;
	
	@Column(name="NUMCARAGRUPADO")
	private BigDecimal numCarAgrupado;
	
	@Column(name="NUMVIASCARAGRUPADO")
	private Integer numViasCarAgrupado;
	
	@Column(name="CODMOTORISTACARAGRUPADO")
	private BigDecimal codMotoristaCarAgrupado;
	
	@Column(name="CODVEICULCARAGRUPADO")
	private BigDecimal codVeiculoCarAgrupado;
	
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
	private BigDecimal codMotTransbordo;
	
	@Column(name="CODAJUDTRANSBORDO")
	private BigDecimal codAjudTransbordo;
	
	@Column(name="OBSDESTINOAGRUP")
	private String obsDestinoAgrupado;
	
	@Column(name="DESTINOAGRUP")
	private String destnoAgrupado;
	
	@Column(name="OBSACERTO")
	private String obsAcerto;
	
	@Column(name="PERCFRETERETIDO")
	private BigDecimal percFreteRetido;
	
	@Column(name="VLFIXO")
	private BigDecimal vlFixo;
	
	@Column(name="VLPED")
	private BigDecimal vlPed;
	
	@Column(name="PERGRIS")
	private BigDecimal perGris;
	
	@Column(name="VALORKG")
	private double valorKg;
	
	@Column(name="CODFUNCCONF")
	private BigDecimal codFuncConf;
	
	@Column(name="LANCARDESPDESCFINAUTOMATIC")
	private String lancarDespDescFinAutomatico = "N";
	
	@Column(name="CODFUNCSAIDACAR")
	private BigDecimal codFuncSaidaCar;
	
	@Column(name="CODFUNCRETORNOCAR")
	private BigDecimal codFuncRetornoCar;
	
	@Column(name="SEGUNDOMON")
	private Integer SegundoMon;
	
	@Column(name="CODVEICULO1")
	private BigDecimal codVeiculo01;
	
	@Column(name="CODVEICULO2")
	private BigDecimal codVeiculo02;
	
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
	private Integer segundosFecha;
	
	@Column(name="CODFUNCAJUD2")
	private BigDecimal codFuncaJud2;
	
	@Column(name="CODFUNCAJUD3")
	private BigDecimal codFuncaoJud3;
	
	@Column(name="DTEXPORTACAO")
	private LocalDate dataExportacao;
	
	@Column(name="OBSEXPORTACAO")
	private String obsExportacao;
	
	@Column(name="IDINTEGRACAOMYFROTA")
	private String idIntegracaoMyFrota;
	
	@Column(name="CODTIPOVEICULO")
	private Integer codTipoVeiculo;
	
	@Column(name="CODPERFILVEICULO")
	private Integer codPerfilVeiculo;
	
	@Column(name="TIPOCALCULOCOMISSAOFRETISTA")
	private String tipoCalculoComissaoFretista;
	
	@Column(name="CODFUNTIPOCALCCOMISSAOFRETISTA")
	private BigDecimal codFunTipoCalcComissaoFretista;
	
	@Column(name="LIBERA_RETAGUARDA")
	private String liberaRetaguarda;
	
	@Column(name="CODFUNCLIBEROURET")
	private BigDecimal codFuncLiberouRet;
	
	@Column(name="DATALIBEROURET")
	private LocalDate dataLiberouRet;
	
	@Column(name="NUMCARMANIFCONCLUIDOFV")
	private String NumCarManifConcluidoFV = "N";
	
	@Column(name="SB_FILIAL")
	private String sbFilial;
	
	@Column(name="CODFUNCFECHA")
	private BigDecimal codFuncFecha;
	
	@Column(name="SB_DTABAST")
	private LocalDate sbDataBast;
	
	@Column(name="SB_SELWMS")
	private Integer sbSelwms = 0;
	
	@Column(name="SB_DTWMS")
	private LocalDate sbDtwms;
	
	@Column(name="SB_SELABAST")
	private Integer sbSelaBast = 0;
	
	@Column(name="SB_SEQABAST")
	private Long sbSeqAbast = 0L;
	
	@Column(name="SB_SEQHORACARGA")
	private Long sbSeqHoraCarga = 0L;
	
	@Column(name="OBSFRETE")
	private String obsFrete;
	
	@Column(name="LANCIMPPRIMPARC")
	private String lancImpprimParc;
	
	@Column(name="NUMONDA")
	private double numOnda;
	
	@Column(name="ORDEMSEP")
	private BigDecimal ordemSep;
	
	@Column(name="ORDEMCONF")
	private BigDecimal ordemConf;
	
	@Column(name="DTMXSALTER")
	private LocalDate dtMxSalter;
	
	@Column(name="CODVEICULOCARREG")
	private Integer codVeiculoCarreg;
	
	@Column(name="IDSOFITVIEW")
	private String idSofitView;
	
	@Column(name="ULTIMASITUACAOCFAT")
	private String ultimaSituacaoCfat;
	
	@Column(name="DATAULTIMASITUACAOCFAT")
	private LocalDate dataUltimaSituacaoFat;
	
	@Column(name="CLIENTEPRESENTE")
	private String clientePresente;
	
	
}

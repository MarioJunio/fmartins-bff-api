package br.com.fmartins.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(schema = "FMARTINS", name = "PCEMPR")
public class Empregado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@EqualsAndHashCode.Include
	private Long matricula;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="DT_EXCLUSAO")
	private LocalDate dataExclusao;
	
	@Column(name="NOME_GUERRA")
	private String nomeGuerra;
	
	@Column(name="ADMISSAO")
	private LocalDate dtadmissao;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="BAIRRO")
	private String bairro;
	
	@Column(name="CIDADE")
	private String cidade;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="FONE")
	private String fone;
	
	@Column(name="CODSETOR")
	private Long codigoSetor;
	
	@Column(name="USUARIOBD")
	private String usuarioBd;
	
	@Column(name="SENHABD")
	private String senhaBd;
	
	@Column(name="SITUACAO")
	private String situacao = "A";
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="TIPOVENDA")
	private String tipoVenda = "T";
	
	@Column(name="CODFILIAL")
	private String codigoFilial;
	
	@Column(name="CODUSUR")
	private Long codUsur;
	
	@Column(name="NUMBANCO")
	private Integer numBanco;
	
	@Column(name="NUMAGENCIA")
	private Long numAgencia;
	
	@Column(name="NUMCCORRENTE")
	private String numCCorrente;
	
	@Column(name="NUMCENTRALPA")
	private Long numCentraPa;
	
	@Column(name="NUMCENTRALTEL")
	private String numCentralTel;
	
	@Column(name="PERMITEALTJUROSBX")
	private String permiteAltJurosBX = "S";
	
	@Column(name="VLAUMENTOLIMCRED")
	private BigDecimal vlAumentoLimCred;
	
	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="RG")
	private String rg;
	
	@Column(name="CTPS")
	private String ctps;
	
	@Column(name="PIS")
	private String pis;
	
	@Column(name="FUNCAO")
	private String funcao;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="FATORCOMISSAO")
	private Double fatorComissao;
	
	@Column(name="DTEXPIRASENHA")
	private LocalDate dtExpiraSenha;
	
	@Column(name="VLCOMISSTON")
	private BigDecimal vlComissTon;
	
	@Column(name="VLCOMISSENT")
	private BigDecimal vlComissEnt;
	
	@Column(name="VLLIMCREDCOMPRA")
	private BigDecimal vlLimCredCompra;
	
	@Column(name="DTINICIOLIMCREDCOMPRA")
	private LocalDate dtInicioLimCredCompra;
	
	@Column(name="DTFIMLIMCREDCOMPRA")
	private LocalDate dtFimLimCredCompra;
	
	@Column(name="CODCONFERENTE")
	private Long codConferente;
	
	@Column(name="CODFUNCAO")
	private Long codFuncao;
	
	@Column(name="SERIECTPS")
	private String serieCtps;
	
	@Column(name="GERACCCARD")
	private String geraCcCard = "N";
	
	@Column(name="MATRICULACCCARD")
	private Long matriculaCcCard;
	
	@Column(name="VLSALCARTEIRA")
	private BigDecimal vlSalCarteira;
	
	@Column(name="VLSALARIO")
	private BigDecimal vlSalario;
	
	@Column(name="RESCISAO")
	private LocalDate recisao;
	
	@Column(name="NUMFILHOS")
	private Integer numFilhos;
	
	@Column(name="COMPLEMENTO")
	private String complemento;
	
	@Column(name="OBSERVACAO")
	private String observacao;
	
	@Column(name="PERCVT")
	private Double perCvt;
	
	@Column(name="VLPLANOSAUDE")
	private BigDecimal vlPlanoSaude;
	
	@Column(name="VLSALFAMILIA")
	private BigDecimal vlSalFamilia;
	
	@Column(name="PERCINSS")
	private Double percInss;
	
	@Column(name="VLPENSAOALIMENTICIA")
	private BigDecimal vlPensaoAlimenticia;
	
	@Column(name="VLADICIONAL")
	private BigDecimal vlAdicional;
	
	@Column(name="VLVALES")
	private BigDecimal vlVales;
	
	@Column(name="VLMAXLIBPEDIDO")
	private BigDecimal vlMaxLibPedido;
	
	@Column(name="CNH")
	private String cnh;
	
	@Column(name="UFCNH")
	private String ufCnh;
	
	@Column(name="TIPOENVIO")
	private String tipoEnvio;
	
	@Column(name="CODFORNEC")
	private Long codFornec;
	
	@Column(name="PERCOMMOT")
	private Double perComMot;
	
	@Column(name="VLFRETEENTREGA")
	private BigDecimal vlFreteEntrega;
	
	@Column(name="CODVEICULO")
	private Long codVeiculo;
	
	@Column(name="PERMITEALTDESCBX")
	private String permiteAltDescBx = "N";
	
	@Column(name="REFERENCIAPESSOAL")
	private String referencialPessoal;
	
	@Column(name="DDDTEL")
	private String dddTel;
	
	@Column(name="NOMEPAI")
	private String nomePai;
	
	@Column(name="NOMEMAE")
	private String nomeMae;
	
	@Column(name="CATEGORIACNH")
	private String categoriaCnh;
	
	@Column(name="TIPOMOTORISTA")
	private String tipoMotorista;
	
	@Column(name="SEXO")
	private String sexo = "M";
	
	@Column(name="DTNASC")
	private LocalDate dtNasc;
	
	@Column(name="DTVALIDADECNH")
	private LocalDate dtValidadeCnh;
	
	@Column(name="ORGAOEMISSORRG")
	private String orgaoEmissorRg;
	
	@Column(name="NACIONALIDADE")
	private String nacionalidade;
	
	@Column(name="ESTADOCIVIL")
	private String estadoCivil;
	
	@Column(name="PROFISSAO")
	private String profissao;
	
	@Column(name="USUARIOLOGADO")
	private String usuarioLogado;
	
	@Column(name="NUMDVAGENCIA")
	private String numDvAgencia;
	
	@Column(name="NUMCONEXOES")
	private Long numConexoes;
	
	@Column(name="NUMCONEXOESATUAL")
	private Long numConexoesAtual;
	
	@Column(name="GRUPOEMAIL")
	private String grupoEmail;
	
	@Column(name="NOMEEMAIL")
	private String nomeEmail;
	
	@Column(name="PERCMINJUROSMORA")
	private Double percMinJurosMora = 0D;
	
	@Column(name="PERCMAXJUROSMORA")
	private Double perMaxJurosMora = 0D;
	
	@Column(name="CODIDIOMA")
	private String codIdioma = "PT-BR";
	
	@Column(name="PERCEXCLIMCRED")
	private Double percExcLimCred;
	
	@Column(name="ENVIAFV")
	private String enviaFv;
	
	@Column(name="PERCREDUZCOMISRCA")
	private Double percReduzComisRca;
	
	@Column(name="VLSALDOLIMALTCREDITO")
	private BigDecimal vlSaldoLimAltCredito = new BigDecimal(999999999999D);
	
	@Column(name="DTINICIO")
	private LocalDate dtInicio;
	
	@Column(name="TIPOATENDE")
	private String tipoAtende;
	
	@Column(name="IPRF")
	private String iprf;
	
	@Column(name="GRUPOOS")
	private Long grupoOs;
	
	@Column(name="CODBARRA")
	private String codBarra;
	
	@Column(name="OBSINATIVO")
	private String obsInativo;
	
	@Column(name="NUMDIASPAGTORETROATIVO")
	private Long numDiasPagtoRetroativo = 0L;

	@Column(name="VENDAASSISTIDA")
	private String vendaAssistida = "N";
	
	@Column(name="NUMCAIXABALCAO")
	private Long numCaixaBalcao;
	
	@Column(name="CODIGOPERFIL")
	private Long codigoPerfil;
	
	@Column(name="MAXTEMPOSECAOOCIOSA")
	private Long maxTempoSecaoOciosa;
	
	@Column(name="USARATEIOCOMISSAOOPERADOR")
	private String usaRateioComissaoOperador;
	
	@Column(name="OBS")
	private String obs;
	
	@Column(name="PERMITEPERSONCAD")
	private String permitePersoncad = "N";
	
	@Column(name="NUMIDENTIFICADORECF")
	private String numIdentificadorEcf;
	
	@Column(name="TIPOAGENTECOB")
	private String tipoAgenteCob = "N";
	
	@Column(name="DIASCOB")
	private Long diasCob;
	
	@Column(name="LIMITEDESCONTO561")
	private Double LimiteDesconto561;
	
	@Column(name="NUMINSS")
	private String numInss;
	
	@Column(name="USABIOMETRIAMENU")
	private String usaBiometriaMenu = "N";
	
	@Column(name="PERCDESC")
	private Double percDesc;
	
	@Column(name="NUMDVCONTA")
	private String numDvConta;
	
	@Column(name="AREAATUACAO")
	private String areaAtuacao;
	
	@Column(name="NUMDIASMAXPRORROG")
	private Long numDiasMaxProrrog;
	
	@Column(name="TIPOCOMISSAO")
	private String tipoComissao;
	
	@Column(name="COMISSAOFIXA")
	private Double comissaoFixa;
	
	@Column(name="USAAVISOAUTOMENU")
	private String usaAvisoAutoMenu = "S";
	
	@Column(name="PERCMAXDESCTITULO")
	private Double percMaxDescTitulo;
	
	@Column(name="RESPLIBCADASTRO")
	private String respLibCadastro;
	
	@Column(name="USATABELACLIENTE")
	private String 	usaTabelaCliente = "N";
	
	@Column(name="VLMAXLIMCREDCLI")
	private BigDecimal vlMaxLimCredCli;
	
	@Column(name="CODPERFIL")
	private Long codPerfil;
	
	@Column(name="USUARIOLOGADORF")
	private String usuarioLogadoRf = "N";
	
	@Column(name="CONCEDERABATIMENTO")
	private String concederAbatimento = "N";
	
	@Column(name="ORGAOEMISSORCNH")
	private String orgaoEmissorCnh;
	
	@Column(name="QTDEPENDENTES")
	private Long qtDependentes;
	
	@Column(name="CODIGOCENTROCUSTO")
	private String codigoCentroCusto;
	
	@Column(name="IDINTEGRACAOMYFROTA")
	private String idIntegracaoMyFrota;
	
	@Column(name="CODCIDADE")
	private Long codCidade;
	
	@Column(name="VLLIMMAXPEDCOMPRA")
	private BigDecimal vlLimMaxPedCompra;
	
	@Column(name="DTDEMISSAO")
	private LocalDate dtDemissao;
	
	@Column(name="CHAPA_RM")
	private String chapaRm;
	
	@Column(name="RAMAL")
	private Long ramal;
	
	@Column(name="AUTOCHEQUEBLOQVENDA")
	private String autoChequeBloqVenda;
	
	@Column(name="SENHAHASH")
	private String SenhaHash;
	
	@Column(name="MOTIVOINATIVACAO")
	private String motivoInativacao;
	
	@Column(name="VLRLIMAPROVARSOLICITACAO")
	private BigDecimal vlrLimAprovarSolicitacao;
	
	@Column(name="FIID")
	private String fiid;
	
	@Column(name="AREAATUACAO_COMPRA")
	private String areaAtuacaoCompra;
	
	@Column(name="AREAATUACAO_VENDAS")
	private String areaAtuacaoVendas;
	
	@Column(name="AREAATUACAO_FINANCEIRO")
	private String areaAtuacaoFinanceiro;
	
	@Column(name="AREAATUACAO_LOGISTICA")
	private String areaAtuacaoLogistica;
	
	@Column(name="AREAATUACAO_EXPEDICAO")
	private String areaAtuacaoExpedicao;
	
	@Column(name="AREAATUACAO_RH")
	private String areaAtuacaoRh;
	
	@Column(name="AREAATUACAO_FISCAL")
	private String areaAtuacaoFiscal;
	
	@Column(name="AREAATUACAO_CONTABIL")
	private String areaAtuacaoContabil;
	
	@Column(name="AREAATUACAO_OUTROS")
	private String areaAtuacaoOutros;
	
	@Column(name="TIPOCARGO")
	private String tipoCargo;
	
	@Column(name="CEP")
	private String cep;
	
	@Column(name="PERDESCMAXITEM")
	private Double perDescMaxItem;
	
	@Column(name="PERDESCMAXRODAPE")
	private Double perDescMaxRodape;
	
	@Column(name="LIM_REDUCAOCREDITO")
	private BigDecimal limReducaoCredito;
	
	@Column(name="LIM_AUMENTOCREDITO")
	private BigDecimal limAumentoCredito;
	
	@Column(name="PERIODO_ALTERACAOCREDITO")
	private Integer periodoAlteracaoCredito;
	
	@Lob
	@Column(name="DIGITALPOLEGAR")
	private byte[] digitalPolegar;
		
	@Lob
	@Column(name="DIGITALINDICADOR")
	private byte[] digitalIndicador;
		
	@Lob
	@Column(name="DIGITALMEDIO")
	private byte[] digitalMedio;
	
	@Lob
	@Column(name="DIGITALANELAR")
	private byte[] digitalAnelar;
	
	@Lob
	@Column(name="DIGITALMINIMO")
	private byte[] digitalMinimo;
	
	@Column(name="DEDOPRIORITARIO")
	private String dedoPrioritario;
	
	@Column(name="SITUACAO_CCW")
 	private String situacaoCcw;
	
	@Column(name="USERMYAUDIT")
	private String userMyAudit;
	
	@Column(name="SENHAMYAUDIT")
	private String senhaMyAudit;
	
	@Column(name="USERMYBI")
	private String userMyBi;
	
	@Column(name="SENHAMYBI")
	private String senhaMyBi;
	
	@Column(name="USERGOGEO")
	private String userGogeo;
	
	@Column(name="SENHAGOGEO")
	private String senhaGogeo;
	
	@Column(name="EMITIRPEDIDO")
	private String emitirPedido = "S";
	
	@Column(name="EMITIRORCAMENTO")
	private String emitirOrcamento = "S";
	
	@Column(name="PERSONALEMBRETE")
	private LocalDate personalLembrete;
	
	@Column(name="DTMXSALTER")
	private LocalDate dtMxsAlter;
	
	@Column(name="IDSOFITVIEW")
	private String idSofitview;
	
	@Column(name="DTULTALTERSOFITVIEW")
	private LocalDateTime dtUltAlterSofitview;
	
	@Column(name="DTEXCLUSAOSOFITVIEW")
	private LocalDateTime dtExclusaoSofitview;
}

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
@Table(schema = "FMARTINS", name = "PCVEICUL")
public class Veiculo implements Serializable {

	@Id
	@Column(name = "CODVEICULO")
	private Long codVeiculo;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "PLACA")
	private String placa;

	@Column(name = "MARCA")
	private String marca;

	@Column(name = "QTPALETE")
	private Integer qtPalete;

	@Column(name = "VOLUME")
	private Double volume;

	@Column(name = "PESOCARGAKG")
	private Double pesoCargaKg;

	@Column(name = "PESOCARGAKG2")
	private Double pesoCargaKg2;

	@Column(name = "SITUACAO")
	private String situacao;

	@Column(name = "TIPOVEICULO")
	private String tipoVeiculo;

	@Column(name = "PROPRIO")
	private String proprio;

	@Column(name = "CODFILIAL")
	private String codFilial;

	@Column(name = "VALORKMRODADO")
	private Double valorKmRodado;

	@Column(name = "ALTURA")
	private Double altura;

	@Column(name = "LARGURA")
	private Double largura;

	@Column(name = "COMPRIMENTO")
	private String comprimento;

	@Column(name = "VLDIARIA")
	private BigDecimal valorDiaria;

	@Column(name = "OBS")
	private String obs;

	@Column(name = "CODFUNCALTSIT")
	private Integer codFuncAltSit;

	@Column(name = "RASTREADO")
	private String rastreado;

	@Column(name = "CODLOCALIZACAO")
	private Integer codLocalizacao;

	@Column(name = "MEDIAKM")
	private Double mediaKm;

	@Column(name = "KMINICIAL")
	private Double kmInicial;

	@Column(name = "KMATUAL")
	private Double kmAtual;

	@Column(name = "QTEIXOS")
	private Integer qtEixos;

	@Column(name = "QTRODAS")
	private Integer qtRodas;

	@Column(name = "QTTANQUES")
	private Integer qtTanques;

	@Column(name = "QTLITROS")
	private Double qtLitros;

	@Column(name = "ULTVIAGEM")
	private Integer ultViagem;

	@Column(name = "CHASSI")
	private String chassi;

	@Column(name = "COR")
	private String cor;

	@Column(name = "OBS2")
	private String obs2;

	@Column(name = "CODROTAPRINC")
	private Integer codRotaPrinc;

	@Column(name = "PRIORIDADE")
	private Integer prioridade;

	@Column(name = "NOMEPROPRIETARIO")
	private String nomeProprietario;

	@Column(name = "ANTT")
	private String antt;

	@Column(name = "CODFORNEC")
	private Integer codFornec;

	@Column(name = "VLFIXO")
	private BigDecimal valorFixo;

	@Column(name = "VLPED")
	private BigDecimal valorPed;

	@Column(name = "VALORKG")
	private BigDecimal valorKg;

	@Column(name = "CODIGORNTRC")
	private String codIGORNTRC;

	@Column(name = "UFPLACAVEICULO")
	private String ufPlacaVeiculo;

	@Column(name = "CIDADEPLACAVEICULO")
	private String cidadePlacaVeiculo;

	@Column(name = "TIPOVEICULO2")
	private String tipoVeiculo2;

	@Column(name = "TIPOVEICUEDI")
	private String tipoVeicuEDI;

	@Column(name = "RENAVAM")
	private String renavam;

	@Column(name = "TIPORODADO")
	private String tipoRodado;

	@Column(name = "TIPOCARROCERIA")
	private String tipoCarroceria;

	@Column(name = "IEPROPRIETARIO")
	private String ieProprietario;

	@Column(name = "UFPROPRIETARIO")
	private String ufProprietario;

	@Column(name = "TIPOPROPRIETARIO")
	private Integer tipoProprietario;

	@Column(name = "CGCCPFPROPRIETARIO")
	private String CgcCpfProprietario;

	@Column(name = "IDINTEGRACAOMYFROTA")
	private String idIntegracaoMyFrota;

	@Column(name = "CODTIPOVEICULO")
	private Integer codTipoVeiculo;

	@Column(name = "COMBUSTIVEL")
	private String combustivel;

	@Column(name = "COMBUSTIVELATIVO")
	private String combustivelAtivo;

	@Column(name = "CONSUMOPADRAO")
	private Double consumoPadrao;

	@Column(name = "CONTROLEACUMULADO")
	private Double controleAcumulado;

	@Column(name = "CONTROLEDECONSUMO")
	private String controleDeConsumo;

	@Column(name = "DATAINICIOCONTROLE")
	private LocalDate dataInicioControle;

	@Column(name = "CONTROLEUSOINICIAL")
	private Double controleUsoInicial;

	@Column(name = "HODOMETROINICIAL")
	private Double homometroInicial;

	@Column(name = "TIPODECONSUMO")
	private String tipoDeConsumo;

	@Column(name = "RETERFRETEAUTON")
	private String reterFreteAuton;

	@Column(name = "DTMXSALTER")
	private LocalDate DtmxSalter;

	@Column(name = "IDSOFITVIEW")
	private String idSofitView;

	@Column(name = "DTULTALTERSOFITVIEW")
	private String dtUltAltErSofttView;

	@Column(name = "DTEXCLUSAOSOFITVIEW")
	private String dteExclusaoSofitView;

}

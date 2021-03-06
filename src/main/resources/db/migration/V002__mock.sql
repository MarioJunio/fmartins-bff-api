insert into FMARTINS.PCPERFILVEICULO(
	CODPERFILVEICULO,
	DSCPERFILVEICULO,
	QTDMINIMA,
	QTDMAXIMA
)values(1,'Caminhão',3,13);

insert into FMARTINS.PCTIPOVEICULO(
	CODTIPOVEICULO,
	DSCTIPOVEICULO,
	CODPERFILVEICULO,
	TIPODIARIA,
	VLDIARIA,
	TIPOTARIFAKGTRANSPORTADO,
	VLTARIFAKGTRANSPORTADO,
	TIPOTARIFAVOLTRANSPORTADO,
	VLTARIFAVOLTRANSPORTADO,
	TIPOTARIFAQTDENTREGA,
	VLTARIFAQTDENTREGA,
	PERIODOINIVIGENCIA,
	PERIODOFIMVIGENCIA,
	COMISSAOINCIDESOBRE,
	PONDERACAOTARIFAPESO,
	PONDERACAOTARIFAVOLUME,
	PONDERACAOTARIFAENTREGA
)values(1,'F34',1,'N',134,'C',456,'A','53','R',87,'2020-08-06','2020-09-05','KM',1.4,1.0,2.0);

insert into FMARTINS.PCCARREG(
	NUMCAR,
	DTSAIDA,
	CODMOTORISTA,
	CODVEICULO,
	TOTPESO,
	TOTVOLUME,
	VLTOTAL,
	DTFECHA,
	DESTINO,
	NUMNOTAS,
	CODCAIXA,
	PERCOM,
	NUMENT,
	NUMCID,
	PREVCHEG,
	DTRETORNO,
	CODCONF,
	DT_CANCEL,
	DATAMON,
	CODFUNCMON,
	DATAMAPA,
	CODFUNCMAPA,
	NUMVIASMAPA,
	DTCAIXA,
	DTFAT,
	CODFUNCFAT,
	CODFUNCCANCEL,
	DATACONF,
	QTITENS,
	OBSFATUR,
	TIPOCARGA,
	KMINICIAL,
	KMFINAL,
	DTSAIDAVEICULO,
	CODROTAPRINC,
	NUMDIARIAS,
	CODFUNCAJUD,
	PAGCOMMOTMIN,
	VLVALERETENCAO,
	HORAFECHA,
	MINUTOFECHA,
	NUMCAROL,
	CONHECFRETE,
	NUMCAROPERLOG,
	DTFECHACOMISSMOT,
	QTCOMBUSTIVEL,
	BALCAOBAIXADO,
	OBSDESTINO,
	VLFRETE,
	ABASTECIDO,
	MAPAGERADOWMS,
	CONHECGERADO,
	MAPAGERADOWMSPAL,
	HORAMON,
	MINUTOMON,
	QTCAIXAS,
	NUMCARWMS,
	VLCOMBUSTIVEL,
	DTINICIOCHECKOUT,
	DTFIMCHECKOUT,
	DATAHORAMAPA,
	CARGASECUNDARIA,
	NUMLANCDIARIA,
	NUMCARBROKER,
	PERCOMTERC,
	PERCOMAJUD,
	TIPOCOMISSAO,
	VLDIARIA,
	VLDESPAJUDANTE,
	LACRE,
	GEOVOLUMETOTAL,
	FROTA_PESO,
	DATACONFFIM,
	DTINICIALPEND,
	DTFINALPEND,
	SEGURADA,
	CODFILIALSAIDA,
	CODFUNCMAPACARAGRUPADO,
	DATAHORAMAPACARAGRUPADO,
	NUMCARAGRUPADO,
	NUMVIASCARAGRUPADO,
	CODMOTORISTACARAGRUPADO,
	CODVEICULCARAGRUPADO,
	DATACARAGRUPADO,
	TRANSFERENCIA,
	LANCTOCPAGARFECHCOMISS414,
	DTFECHACOMMOTTRANSB,
	DTFECHACOMAJUDTRANSB,
	DTFECHACOMAJUD,
	CODMOTTRANSBORDO,
	CODAJUDTRANSBORDO,
	OBSDESTINOAGRUP,
	DESTINOAGRUP,
	OBSACERTO,
	PERCFRETERETIDO,
	VLFIXO,
	VLPED,
	PERGRIS,
	VALORKG,
	CODFUNCCONF,
	LANCARDESPDESCFINAUTOMATIC,
	CODFUNCSAIDACAR,
	CODFUNCRETORNOCAR,
	SEGUNDOMON,
	CODVEICULO1,
	CODVEICULO2,
	NUMONUCARGA,
	NOMEAPROPRIADOCARGA,
	DIVISAOCARGA,
	GRUPOEMBCARGA,
	QTDTOTALPRODCARGA,
	PONTOFUGORCARGA,
	SEGUNDOSFECHA,
	CODFUNCAJUD2,
	CODFUNCAJUD3,
	DTEXPORTACAO,
	OBSEXPORTACAO,
	IDINTEGRACAOMYFROTA,
	CODTIPOVEICULO,
	CODPERFILVEICULO,
	TIPOCALCULOCOMISSAOFRETISTA,
	CODFUNTIPOCALCCOMISSAOFRETISTA,
	LIBERA_RETAGUARDA,
	CODFUNCLIBEROURET,
	DATALIBEROURET,
	NUMCARMANIFCONCLUIDOFV,
	SB_FILIAL,
	CODFUNCFECHA,
	SB_DTABAST,
	SB_SELWMS,
	SB_DTWMS,
	SB_SELABAST,
	SB_SEQABAST,
	SB_SEQHORACARGA,
	OBSFRETE,
	LANCIMPPRIMPARC,
	NUMONDA,
	ORDEMSEP,
	ORDEMCONF,
	DTMXSALTER,
	CODVEICULOCARREG,
	IDSOFITVIEW,
	ULTIMASITUACAOCFAT,
	DATAULTIMASITUACAOCFAT,
	CLIENTEPRESENTE
) values 
(1, now(), 1, 1, 13.5, 10.5, 345242.21, '2020-08-13', 'Maceio', 5, 6, 10, 10, 1421, '2020-08-11', null, 4, null, '2020-08-07', null, null, null, null, null, null, 4, 4, '2020-08-11', 114, 'Observação da fatura...', 'D', 0, 15123, '2020-08-06', 931, 3, 345, 'C', 1242, 18, 0, 131, 'S', 42, '2020-08-29', 1321, 'N', 'Sem obs de destino', 2400, 'S', 'C', 'S', 'N', null, null, 594, null, 3.7, '2020-08-09', '2020-08-10', null, 'N', 3, 1, 2, 3, 'RS', 154, 60, 'N', 1300, 43200, null, null, null, 'S', 64, null, null, 1, null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, 4532, 5421, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, 'C', null, null, null, null, null, null, null, null, 6, null, 9, 5, 2, null, null, null, null, null, null, null, null, null, null, null),
(2, now(), 1, 1, 13.5, 10.5, 345242.21, '2020-08-13', 'Natal', 5, 6, 10, 10, 1421, '2020-08-11', '2020-08-18', 4, null, '2020-08-20', null, null, null, null, null, null, 4, 4, '2020-08-11', 114, 'Observação da fatura 2...', 'D', 0, 15123, '2020-08-06', 931, 3, 345, 'C', 1242, 18, 0, 131, 'S', 42, '2020-08-29', 1321, 'N', 'Sem obs de destino', 2400, 'S', 'C', 'S', 'N', null, null, 594, null, 3.7, '2020-08-09', '2020-08-10', null, 'N', 3, 1, 2, 3, 'RS', 154, 60, 'N', 1300, 43200, null, null, null, 'S', 64, null, null, null, null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, 4532, 5421, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, 'C', null, null, null, null, null, null, null, null, 6, null, 9, 5, 2, null, null, null, null, null, null, null, null, null, null, null),
(3, now(), 1, 1, 13.5, 10.5, 345242.21, '2020-08-13', 'Goiania', 5, 6, 10, 10, 1421, '2020-08-11', '2020-08-18', 4, null, '2020-08-17', null, null, null, null, null, null, 4, 4, '2020-08-11', 114, 'Observação da fatura 3...', 'D', 0, 15123, '2020-08-06', 931, 3, 345, 'C', 1242, 18, 0, 131, 'S', 42, '2020-08-29', 1321, 'N', 'Sem obs de destino', 2400, 'S', 'C', 'S', 'N', null, null, 594, null, 3.7, '2020-08-09', '2020-08-10', null, 'N', 3, 1, 2, 3, 'RS', 154, 60, 'N', 1300, 43200, null, null, null, 'S', 64, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4532, 5421, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, 'C', null, null, null, null, null, null, null, null, 6, null, 9, 5, 2, null, null, null, null, null, null, null, null, null, null, null),
(4, now(), 1, 1, 13.5, 10.5, 345242.21, '2020-08-13', 'Uberlandia', 5, 6, 10, 10, 1421, '2020-08-11', '2020-08-18', 4, null, '2020-08-18', null, null, null, null, null, null, 4, 4, '2020-08-11', 114, 'Observação da fatura 4...', 'D', 0, 15123, '2020-08-06', 931, 3, 345, 'C', 1242, 18, 0, 131, 'S', 42, '2020-08-29', 1321, 'N', 'Sem obs de destino', 2400, 'S', 'C', 'S', 'N', null, null, 594, null, 3.7, '2020-08-09', '2020-08-10', null, 'N', 3, 1, 2, 3, 'RS', 154, 60, 'N', 1300, 43200, null, null, null, 'S', 64, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4532, 5421, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, 'C', null, null, null, null, null, null, null, null, 6, null, 9, 5, 2, null, null, null, null, null, null, null, null, null, null, null),
(5, now(), 1, 1, 13.5, 10.5, 345242.21, '2020-08-13', 'Belo Horizonte', 5, 6, 10, 10, 1421, '2020-08-11', '2020-08-18', 4, null, null, null, null, null, null, null, null, 4, 4, '2020-08-11', 114, 'Observação da fatura 5...', 'D', null, 15123, '2020-08-06', 931, 3, 345, 'C', 1242, 18, 0, 131, 'S', 42, '2020-08-29', 1321, 'N', 'Sem obs de destino', 2400, 'S', 'C', 'S', 'N', null, null, 594, null, 3.7, '2020-08-09', '2020-08-10', null, 'N', 3, 1, 2, 3, 'RS', 154, 60, 'N', 1300, 43200, null, null, null, 'S', 64, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4532, 5421, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, 'C', null, null, null, null, null, null, null, null, 6, null, 9, 5, 2, null, null, null, null, null, null, null, null, null, null, null),
(6, now(), 1, 1, 13.5, 10.5, 345242.21, '2020-08-13', 'Rio de Janeiro', 5, 6, 10, 10, 1421, '2020-08-11', '2020-08-18', 4, null, null, null, null, null, null, null, null, 4, 4, '2020-08-11', 114, 'Observação da fatura 6...', 'D', null, 15123, '2020-08-06', 931, 3, 345, 'C', 1242, 18, 0, 131, 'S', 42, '2020-08-29', 1321, 'N', 'Sem obs de destino', 2400, 'S', 'C', 'S', 'N', null, null, 594, null, 3.7, '2020-08-09', '2020-08-10', null, 'N', 3, 1, 2, 3, 'RS', 154, 60, 'N', 1300, 43200, null, null, null, 'S', 64, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4532, 5421, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, 'C', null, null, null, null, null, null, null, null, 6, null, 9, 5, 2, null, null, null, null, null, null, null, null, null, null, null),
(7, now(), 1, 1, 13.5, 10.5, 345242.21, '2020-08-13', 'Rio Branco', 5, 6, 10, 10, 1421, '2020-08-11', null, 4, null, null, null, null, null, null, null, null, 4, 4, '2020-08-11', 114, 'Observação da fatura 7...', 'D', 0, 15125, '2020-08-07', 931, 3, 345, 'C', 1242, 18, 0, 131, 'S', 42, '2020-08-29', 1321, 'N', 'Sem obs de destino', 2400, 'S', 'C', 'S', 'N', null, null, 594, null, 3.7, '2020-08-09', '2020-08-10', null, 'N', 3, 1, 2, 3, 'RS', 154, 60, 'N', 1300, 43200, null, null, null, 'S', 64, null, null, 2, null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, 4532, 5421, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, 'C', null, null, null, null, null, null, null, null, 6, null, 9, 5, 2, null, null, null, null, null, null, null, null, null, null, null);    

insert into FMARTINS.PCEMPR(MATRICULA, NOME, NOME_GUERRA, CODVEICULO, ADMISSAO, ENDERECO, BAIRRO, CIDADE, ESTADO, CPF, CODSETOR) 
values 
(1, 'Mario Junio Marques Martins', 'MarioJ93', 1, '2020-07-09', 'Rua Duarte da Costa 1575', 'Jardim Zenite', 'Monte Carmelo', 'MG', '11420237616', 4);

insert into FMARTINS.PCVEICUL(CODVEICULO, DESCRICAO, PLACA) VALUES (1, 'F250', 'HGP-4252'), (2, 'C40', 'FSI-8664');
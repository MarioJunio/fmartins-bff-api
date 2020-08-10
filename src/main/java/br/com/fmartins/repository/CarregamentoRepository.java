package br.com.fmartins.repository;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fmartins.model.Carregamento;
import br.com.fmartins.resource.dto.response.CarregamentoAgrupadoNaoFinalizadoDTO;
import br.com.fmartins.resource.dto.response.CarregamentoDTO;

@Repository
public interface CarregamentoRepository extends CrudRepository<Carregamento, Long> {

	@Query("SELECT COUNT(1) FROM Carregamento c WHERE c.dataMon >= :daysBefore AND c.kmInicial > 0 AND c.numCar = :numCarregamento")
	Optional<Long> verificarLancamento(@Param("daysBefore") LocalDate daysBefore,
			@Param("numCarregamento") BigInteger numCarregamento);

	@Query("SELECT new br.com.fmartins.resource.dto.response.CarregamentoDTO(c.numCar, c.destino, c.pesoTotal, c.volumeTotal) FROM Carregamento c WHERE c.numCar = :numCarregamento")
	Optional<CarregamentoDTO> pesquisar(@Param("numCarregamento") BigInteger numCarregamento);

	@Modifying
	@Query("UPDATE Carregamento c SET c.dataSaidaVeiculo = :dataSaida, c.codVeiculoCarAgrupado = :codVeiculo, c.kmInicial = :kmInicial, c.codMotoristaCarAgrupado = :matricula, c.numCarAgrupado = :numCarAgrupado WHERE c.numCar = :numCar")
	void atualizar(@Param("dataSaida") LocalDate dataSaida, @Param("codVeiculo") BigInteger codVeiculo,
			@Param("kmInicial") Double kmInicial, @Param("matricula") BigInteger matricula,
			@Param("numCarAgrupado") BigInteger numCarAgrupado, @Param("numCar") BigInteger numCarregamento);

	@Query("SELECT new br.com.fmartins.resource.dto.response.CarregamentoAgrupadoNaoFinalizadoDTO(c.numCarAgrupado, c.dataSaidaVeiculo, c.kmInicial, SUM(c.pesoTotal), SUM(c.volumeTotal)) FROM Carregamento c WHERE c.dataRetorno IS NULL AND c.dataSaida >= :dataSaida AND c.codMotoristaCarAgrupado = :matricula GROUP BY c.numCarAgrupado, c.dataSaidaVeiculo, c.kmInicial")
	List<CarregamentoAgrupadoNaoFinalizadoDTO> pesquisarCarregamentosAgrupados(
			@Param("dataSaida") LocalDate dataSaida, @Param("matricula") BigInteger codMotoristaCarAgrupado);
}

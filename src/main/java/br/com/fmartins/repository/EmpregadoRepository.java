package br.com.fmartins.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fmartins.model.Empregado;
import br.com.fmartins.resource.dto.response.EmpregadoDTO;

@Repository
public interface EmpregadoRepository extends CrudRepository<Empregado, Long> {

	@Query("SELECT new br.com.fmartins.resource.dto.response.EmpregadoDTO(e.matricula, e.nomeGuerra, e.codVeiculo) FROM Empregado e WHERE e.matricula = :matricula")
	Optional<EmpregadoDTO> buscarPorMatricula(@Param("matricula") Long matricula);
}

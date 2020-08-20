package br.com.fmartins.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fmartins.model.Veiculo;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {

}

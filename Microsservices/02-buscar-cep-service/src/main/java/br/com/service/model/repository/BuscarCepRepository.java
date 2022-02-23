package br.com.service.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.service.model.Cidade;
import br.com.service.model.Logradouro;

public interface BuscarCepRepository extends JpaRepository<Logradouro, Long> {

	@Query("SELECT c.descricao, c.uf, l.codigo_cidade_ibge from Logradouro l JOIN l.cidade c \n"
			+ "			WHERE (c.id_cidade = l.cidade) and l.cep = :cep")
	public Iterable<Logradouro> buscar(String cep);
	
	public Logradouro findByCep(String cep);
	
}

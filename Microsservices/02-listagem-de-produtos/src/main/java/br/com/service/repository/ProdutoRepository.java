package br.com.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.service.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAll();
	public Produto findByNome(String nome);

}

package br.com.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.service.model.Produto;
import br.com.service.repository.ProdutoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name = "Buscar Produtos Service")
@RequestMapping("/produtos")
@RestController
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping(value = "/todos")
	public List<Produto> listar() {
		
		return repository.findAll();
	}
	@Operation(summary = "Busca um produto através do nome")
	@GetMapping(value = "/nome/{nome}")
	public Produto buscar(@PathVariable("nome") String nome) {
		
		return repository.findByNome(nome);
		
	}


}

package br.com.service.ConnectService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.service.model.Produto;

@FeignClient(name = "produtos-service")
public interface ConnectServiceProdutos {
	
	@GetMapping(value = "/produtos/todos")
	public List<Produto> listar();
	
	@GetMapping(value = "/produtos/nome/{nome}")
	public Produto buscar(@PathVariable("nome") String nome);

}

package br.com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.service.ConnectService.ConnectServiceProdutos;
import br.com.service.model.Compra;
import br.com.service.model.Produto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name = "Compra-Endpoint")
@RequestMapping("/comprar")
@RestController
public class CompraController {

	@Autowired
	private ConnectServiceProdutos serviceProd;
	@Autowired
	private Produto prod;
	@Autowired
	private Compra compra;
    //http://localhost:8100/v3/api-docs para chamar a documentação
	//http://localhost:8100/swagger-ui.html chama o modo gráfico
	@Operation(summary = "Busca um produto no banco de dados através do nome e o cep da cidade do usuário, "
			+ "em seguida traz o valor do produto com o frete daquela região")
	@GetMapping("{nome}/{cep}")
	public Compra comprar(@PathVariable("nome") String nome, @PathVariable("cep") String cep) {
		prod = serviceProd.buscar(nome);
		compra.setCep(cep);
		compra.setNomeProduto(prod.getNome());
		compra.setPreco(prod.getPreco());
		compra.setFrete(20.0);
		compra.setTotalProduto(prod.getPreco() + compra.getFrete());
		

		return compra;

	}

}

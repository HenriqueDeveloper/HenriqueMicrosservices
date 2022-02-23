package br.com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.service.excpetions.CepNotFoundException;
import br.com.service.model.Cidade;
import br.com.service.model.Logradouro;
import br.com.service.model.repository.BuscarCepRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name = "buscar-cep-API")
@RequestMapping("/buscar")
@RestController
public class BuscarCepController {
	
	@Autowired
	private BuscarCepRepository repository;
	
	@Operation(description = "Busca as informções de uma cidade através do cep")
	@GetMapping("/cep/{cep}")
	public Logradouro BuscarCidade(@PathVariable("cep") String cep) throws Exception {
		Logradouro logradouro = repository.findByCep(cep);
		if(logradouro == null) {
			throw new CepNotFoundException("CEP não encontrado!");
		}
		return logradouro;
		
		
	}

}

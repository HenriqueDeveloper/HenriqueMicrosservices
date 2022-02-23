package br.com.service.ConnectService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.service.model.Logradouro;

@FeignClient(name = "buscar-cep-service")
public interface ConnectServiceCep {
	
	@GetMapping("/buscar/cep/{cep}")
	public Logradouro BuscarCidade(@PathVariable("cep") String cep);

}

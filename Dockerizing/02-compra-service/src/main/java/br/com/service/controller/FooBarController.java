package br.com.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Foobar")
@RequestMapping("comprar")
@RestController
public class FooBarController {
	
	private Logger logger = LoggerFactory.getLogger(FooBarController.class);
	
	@GetMapping("/foo-bar")
	//@Retry(name = "default", fallbackMethod = "fallbackMethod")
	//@CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
	@RateLimiter(name = "default") //determina a quantidade de chamadas que podemos fazer para um endpoint
	//@Bulkhead(name = "default") //determina quantas execuções concorrente vamos ter
	@Operation(summary = "Foobar")
	public String foobar() {
		logger.info("Request to foo-bar is received");
		/*var response = new RestTemplate().getForEntity("http://localhost:8080/foo-bar", String.class);
		return response.getBody();*/
		
		return "foo-bar";
	}
	
	public String fallbackMethod(Exception e) {
		
		return "fallbackMethod foobar";
		
	}

}

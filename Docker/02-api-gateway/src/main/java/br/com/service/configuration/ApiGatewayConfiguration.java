package br.com.service.configuration;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApiGatewayConfiguration {
	
	/*@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder build) {
		
		Function<PredicateSpec, Buildable<Route>> function =
				p -> p.path("/get")
				.filters(f -> f.addRequestHeader("hello", "world").addRequestParameter("hello", "world"))
				     .uri("http://httpbin.org:80"); // ferramento de disgnostico que converte chamada http em json
		return build.routes()                      
				    .route(function)
				    .route(p -> p.path("/comprar/**").uri("lb://compra-service"))
				    .route(p -> p.path("/buscar/**").uri("lb://buscar-cep"))
				    .route(p -> p.path("/produtos/**").uri("lb://produtos-service"))
				    .build();
	*/

}

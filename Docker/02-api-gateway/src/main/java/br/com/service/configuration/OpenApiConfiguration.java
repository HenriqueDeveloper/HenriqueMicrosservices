package br.com.service.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class OpenApiConfiguration {
	@Bean
	@Lazy(false) //deve ser carregado assim que o api-gateway estiver inicializando
	public List<GroupedOpenApi> apis(SwaggerUiConfigParameters swaggerUiConfigParameters,
			RouteDefinitionLocator locator){
		var definitions = locator.getRouteDefinitions().collectList().block();
		definitions.stream().filter(
				routeDefinition -> routeDefinition.getId()
				.matches(".*-service"))
				.forEach(routeDefinition -> {
					String name = routeDefinition.getId();
					swaggerUiConfigParameters.addGroup(name);
					GroupedOpenApi.builder().pathsToMatch("/" + name + "/**").group(name).build();
				}
				);
		
		
		return new ArrayList();
		
	}

}

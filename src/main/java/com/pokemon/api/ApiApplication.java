package com.pokemon.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title =  "Pokemon review ",
				version = "1.0.0",
				description = "Rex comes",
				termsOfService = "runcodeno",
				contact = @Contact(
						name = "Mr KO",
						email = "kosaema"
				),
				license = @License(
						name = "Licene",
						url = "runcodnow"
				)
		)
)
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}

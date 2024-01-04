package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl" )
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title="Accounts microservice REST API Documentation",
				description = "EazyBank Accounts microservices REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Shreyash Kashyap",
						email = "shreyaskashyap05@gmail.com",
						url = "https://github.com/sh5800"
				),
				license = @License(
						name="Apache 2.0",
						url="https://github.com/sh5800"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts microservices REST API Documentation",
				url="https://github.com/sh5800"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}


package com.greatlearning.employeeapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket libraryApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.groupName("Employee-RestApi")
				.select().apis(RequestHandlerSelectors.basePackage("com.gl.library.controller"))
				.build();
	}
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee-RestApi")
				.description("reference for developers")
				.termsOfServiceUrl("http://ems.com")
				.contact(new Contact("Employee-RestApi", "http://ems.com", "ems@gmail.com"))
				.license("EMS Lisence")
				.licenseUrl("http://ems.com")
				.version("1.0")
				.build();
	}

}

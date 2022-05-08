/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.o2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author YNBR 17-Mar-2022
 *
 */
@Configuration
public class O2ServiceSwaggerConfig {
	  @Bean
	    public Docket createRestApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	        		.apiInfo(new ApiInfoBuilder()
	        		.description("O2 service API")
	        		.title("o2 Service Api")
	        		.version("1.0.0")
	        		.build())
	        		.enable(true)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.o2.controller"))
	                .paths(PathSelectors.any())
	                .build();
	    }

}

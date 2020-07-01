package com.akg.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class MySiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySiteApplication.class, args);
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    if (!registry.hasMappingForPattern("/resources/**")) {
	        registry.addResourceHandler("/resources/**").addResourceLocations(
	                "classpath:/resources/static/");
	    }

	}

}

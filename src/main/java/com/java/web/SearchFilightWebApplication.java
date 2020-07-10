package com.java.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.java.controller.FlighSearchController;

@SpringBootApplication
@ComponentScan(basePackages={"com.java"})
@EnableAutoConfiguration
public class SearchFilightWebApplication  extends SpringBootServletInitializer{

	private static Class FlightSearchControllerClass = FlighSearchController.class; 
	
	public static void main(String[] args) {
		SpringApplication.run(SearchFilightWebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FlightSearchControllerClass);
	}

}

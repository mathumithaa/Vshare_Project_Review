
package com.virtusa.vshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.virtusa.vshare.controller","com.virtusa.vshare.config"})
public class VshareApplication {

	public static void main(String[] args) {
		SpringApplication.run(VshareApplication.class, args);
	}

}
package com.in28minutes.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes")
public class SpringbootFirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstWebApplication.class, args);
	}

}

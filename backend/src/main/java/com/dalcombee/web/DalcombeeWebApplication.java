package com.dalcombee.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dalcombee.web.core.config.MyServletContextInitializer;

@SpringBootApplication
public class DalcombeeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[] { DalcombeeWebApplication.class, MyServletContextInitializer.class }, args);
	}
}

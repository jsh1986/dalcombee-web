package com.dalcombee.web.core.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletContextInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyServletContextInitializer implements ServletContextInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		log.info("MyServletContextInitializer onStartup()");
		sc.addListener(MyHttpSessionListener.class);
	}

}

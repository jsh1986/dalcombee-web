package com.dalcombee.web.core.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class MyWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		System.out.println("#### MyWebAppInitializer onStartup()");
		sc.addListener(MyHttpSessionListener.class);
	}

}

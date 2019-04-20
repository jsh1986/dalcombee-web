package com.dalcombee.web.core.config;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import lombok.extern.slf4j.Slf4j;

/**
 * https://stackoverflow.com/questions/2960764/how-to-set-session-timeout-dynamically-in-java-web-applications
 * @author jsh
 *
 */
@Slf4j
public class MyHttpSessionListener implements HttpSessionListener {
	
//	private final int MAX_SESSION_SECONDS = 30 * 24 * 60 * 60; // 30일
	private final int MAX_SESSION_SECONDS = 3;
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().setMaxInactiveInterval(MAX_SESSION_SECONDS); // in seconds
		log.info("sessionCreated. Session ID: {}", event.getSession().getId());
		System.out.println("sessionCreated. Session ID: {}" + event.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		
		log.info("sessionDestroyed. Session ID: {}", event.getSession().getId());
		System.out.println("sessionDestroyed. Session ID: {}" + event.getSession().getId());
	}

}
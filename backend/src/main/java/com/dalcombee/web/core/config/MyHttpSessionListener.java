package com.dalcombee.web.core.config;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * https://stackoverflow.com/questions/2960764/how-to-set-session-timeout-dynamically-in-java-web-applications
 * @author jsh
 *
 */
public class MyHttpSessionListener implements HttpSessionListener {
	
	private final int MAX_SESSION_SECONDS = 30 * 24 * 60 * 60; // 30일
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().setMaxInactiveInterval(MAX_SESSION_SECONDS); // in seconds
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}

}
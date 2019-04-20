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
	
	private final int MAX_SESSION_SECONDS = 30 * 24 * 60 * 60; // 30일. 브라우저를 끄지 않으면, 이 시간 이후에 로그아웃 처리됨.
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().setMaxInactiveInterval(MAX_SESSION_SECONDS); // in seconds
		log.info("sessionCreated. Session ID: {}", event.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		log.info("sessionDestroyed. Session ID: {}", event.getSession().getId());
	}

}
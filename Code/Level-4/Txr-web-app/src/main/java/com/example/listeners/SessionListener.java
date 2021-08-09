package com.example.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("HttpSessionListener:sessionCreated");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("HttpSessionListener:sessionDestroyed");
	}
	
}

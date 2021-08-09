package com.example.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//
		/*
		 * 
		 *  if you are using spring , create ApplicationContext object...
		 * 
		 */
		System.out.println("ServletContextListener:contextInitialized");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//
		/*
		 * 
		 *  if you are using spring , close ApplicationContext object...
		 * 
		 */
		System.out.println("ServletContextListener:contextDestroyed");
	}

}

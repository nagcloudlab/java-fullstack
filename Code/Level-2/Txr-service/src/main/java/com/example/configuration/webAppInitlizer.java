package com.example.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitlizer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("onStartup");
        AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
        applicationContext.register(TxrServiceConfiguration.class);
//        applicationContext.setServletContext(servletContext);

//        // Front Controller
        ServletRegistration.Dynamic servlet= servletContext.addServlet("dispatcher",new DispatcherServlet(applicationContext));
        servlet.setLoadOnStartup(0);
        servlet.addMapping("*.htm");
//
    }
}

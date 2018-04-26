package com.sunny.listners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MyContextListener implements ServletContextListener{


    public MyContextListener() {

    	System.out.println("MyContextListener() Default Constructor");
    }




    public void contextInitialized(ServletContextEvent event)  { 

    	ServletContext ctx=event.getServletContext();
    	System.out.println("MyContextListener Context Initilized :"+ctx);
    }







	@Override
	public void contextDestroyed(ServletContextEvent event) {
	  	ServletContext ctx=event.getServletContext();
    	System.out.println("Context Destroyed :"+ctx);
  	
	}








	
}

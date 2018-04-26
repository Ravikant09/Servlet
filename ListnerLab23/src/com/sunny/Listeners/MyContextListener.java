package com.sunny.Listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



public class MyContextListener implements ServletContextListener {


    public MyContextListener() {

    	System.out.println("MyContextListener() Default Constructor");
    }


    public void contextDestroyed(ServletContextEvent event)  { 
    	System.out.println("context Destroyed");
    	ServletContext ctx=event.getServletContext();
    	Integer it=(Integer) ctx.getAttribute("TC");
    	int TC=it.intValue();
    	System.out.println(TC);
    	
    }


    public void contextInitialized(ServletContextEvent event)  { 

    	System.out.println("context Initilized");
    	ServletContext ctx=event.getServletContext();
    	ctx.setAttribute("TV", 0);				//Get TV value from DB int tc=0;
    	ctx.setAttribute("TA", 0);
        }
	
}

package com.sunny.listners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;



@WebListener
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

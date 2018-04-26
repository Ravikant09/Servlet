package com.sunny.listners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListener implements HttpSessionListener {


    public MySessionListener() {

    	System.out.println("MySessionListener Default Constructor");
    }


    public void sessionCreated(HttpSessionEvent event)  { 

    	System.out.println("MySessionListener sessionCreated");
    	
    }


    public void sessionDestroyed(HttpSessionEvent event)  { 

    	System.out.println("MySessionListener sessionDestroyed");

    }
	
}

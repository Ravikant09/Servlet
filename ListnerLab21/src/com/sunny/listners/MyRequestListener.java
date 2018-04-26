package com.sunny.listners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


public class MyRequestListener implements ServletRequestListener {


    public MyRequestListener() {

    	System.out.println("MyRequestListener Default Constructor");
    }


public void requestDestroyed(ServletRequestEvent event)  { 
	
		System.out.println("MyRequestListener requestDestroyed");
	}


    public void requestInitialized(ServletRequestEvent arg0)  { 

    	System.out.println("MyRequestListener requestInitilized");
    }
	
}

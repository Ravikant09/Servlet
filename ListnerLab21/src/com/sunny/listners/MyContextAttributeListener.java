package com.sunny.listners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;


public class MyContextAttributeListener implements ServletContextAttributeListener {


    public MyContextAttributeListener() {

    	System.out.println("MyContextAttributeListener() DEfault Constructor");
    }


    public void attributeAdded(ServletContextAttributeEvent event)  { 

    	String nm=event.getName();
    	String val=event.getValue().toString();
    	
    	System.out.println("MyContextAttributeListener Added Attribute :"+nm+"\t\t"+val);
    }


    public void attributeRemoved(ServletContextAttributeEvent event)  { 

    	String nm=event.getName();
    	String val=event.getValue().toString();
    	
    	System.out.println("MyContextAttributeListener Remove Attribute :"+nm+"\t\t"+val);

    }


    public void attributeReplaced(ServletContextAttributeEvent event)  { 

    	String nm=event.getName();
    	String val=event.getValue().toString();
    	
    	System.out.println("MyContextAttributeListener Replaced Attribute :"+nm+"\t\t"+val);

    }
	
}

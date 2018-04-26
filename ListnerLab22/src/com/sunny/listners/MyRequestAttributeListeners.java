package com.sunny.listners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyRequestAttributeListeners implements ServletRequestAttributeListener {


    public MyRequestAttributeListeners() {

    	System.out.println("MyRequestAttributeListeners Default Constructor");
    	
    }


    public void attributeRemoved(ServletRequestAttributeEvent event)  { 

    	String nm=event.getName();
    	String val=event.getValue().toString();
    	System.out.println("MyRequestAttributeListeners attributeRemoved "+nm+"\t\t"+val);
    }


    public void attributeAdded(ServletRequestAttributeEvent event)  { 

       	String nm=event.getName();
    	String val=event.getValue().toString();
    	System.out.println("MyRequestAttributeListeners attributeAdded "+nm+"\t\t"+val);
 
    }


    public void attributeReplaced(ServletRequestAttributeEvent event)  { 

       	String nm=event.getName();
    	String val=event.getValue().toString();
    	System.out.println("MyRequestAttributeListeners attributeReplaced "+nm+"\t\t"+val);
 
    }
	
}

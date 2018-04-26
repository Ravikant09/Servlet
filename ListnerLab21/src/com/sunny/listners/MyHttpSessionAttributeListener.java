package com.sunny.listners;


import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {


    public MyHttpSessionAttributeListener() {

    	System.out.println("MyHttpSessionAttributeListener Defalult Constructor");
    }


    public void attributeAdded(HttpSessionBindingEvent event)  { 

    	String nm=event.getName();
    	String val=event.getValue().toString();
    	String src=event.getSource().toString();
    	System.out.println("MyHttpSessionAttributeListener attributeAdded "+nm+"\t\t"+val+"\t\t"+src);
    	
    }


    public void attributeRemoved(HttpSessionBindingEvent event)  { 


       	String nm=event.getName();
    	String val=event.getValue().toString();
    	String src=event.getSource().toString();
    	System.out.println("MyHttpSessionAttributeListener attributeRemoved "+nm+"\t\t"+val+"\t\t"+src);
    	
 
    }


    public void attributeReplaced(HttpSessionBindingEvent event)  { 

       	String nm=event.getName();
    	String val=event.getValue().toString();
    	String src=event.getSource().toString();
    	System.out.println("MyHttpSessionAttributeListener attributeReplaced "+nm+"\t\t"+val+"\t\t"+src);
    	
     }
	
}

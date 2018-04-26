package com.sunny.Listeners;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListener implements HttpSessionListener {



	public MySessionListener() {

		System.out.println("MySessionListener Default Constructor");
	}


    public void sessionCreated(HttpSessionEvent event)  { 

    	HttpSession sess=event.getSession();
    	ServletContext ctx=sess.getServletContext();
    	
    	int tv=(Integer) ctx.getAttribute("TV");
		tv++;
		ctx.setAttribute("TV", tv);
    
    	int ta=(Integer) ctx.getAttribute("TA");
		ta++;
		ctx.setAttribute("TA", ta);

    }


    public void sessionDestroyed(HttpSessionEvent event)  { 

    	HttpSession sess=event.getSession();
    	ServletContext ctx=sess.getServletContext();
    	int ta=(Integer) ctx.getAttribute("TA");
		ta--;
		ctx.setAttribute("TA", ta);

    }
	
}

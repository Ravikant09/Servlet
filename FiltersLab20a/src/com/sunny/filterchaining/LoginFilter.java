package com.sunny.filterchaining;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;



public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {

    	System.out.println("Hey LoginFilter Default Constructor");
    }


	public void destroy() {

		System.out.println("Destroy Method is Called in :"+this.getClass().getName());

	}



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("doFilter Method is Called in :"+this.getClass().getName());

		HttpServletRequest req=(HttpServletRequest)request;		//Since ServletRequset has service method from Generic
		//Servlet and HttpServletRequest has service method from HttpServlet and Generic is super type for HttpServlet
		//so Down-casting required
		
		String ipAddress=req.getRemoteAddr();
		System.out.println("IP :"+ipAddress+" Date :"+new Date().toString());
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}



	public void init(FilterConfig fConfig) throws ServletException {
	
		System.out.println("init Method is Called in :"+this.getClass().getName());

	}

}

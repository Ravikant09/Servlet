package com.sunny.filterchaining;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AuthenticationFilter implements Filter {


    public AuthenticationFilter() {


    	System.out.println("Hey AuthenticationFilter Default Constructor");

    }



    public void destroy() {

		System.out.println(" Destroy Method is Called in :"+this.getClass().getName());
    }


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("doFilter Method is Called in :"+this.getClass().getName());

		HttpServletRequest req=(HttpServletRequest)request;		

		HttpServletResponse res=(HttpServletResponse)response;		//Since ServletRequset and Response has service 
		//method from GenericServlet and HttpServletRequest and Response has service method from HttpServlet and 
		//Generic is super type for HttpServlet so Down-casting required

		String usnm=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		if(!(usnm.equals("Sunny")&& pwd.equals("Mohan"))){
			
		System.out.println("UnAuthorized request");
		res.sendRedirect("index.html");
	}
		else{
			chain.doFilter(request, response);
					
		}
	}


public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("init Method is Called in :"+this.getClass().getName());
	}

}

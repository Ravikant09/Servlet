package com.sunny.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class DemoFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DemoFilter() {

    	System.out.println("Filter Default Constructor");
    }



    
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DemoFilter Destroy()");
	}



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Demo Filter doFilter() PreProcessing Begin");
		String nm=request.getParameter("name");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("Demo Filter doFilter() PreProcessing Ends");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("Demo Filter doFilter() PostProcessing Begin");
		Object obj=request.getAttribute("MSG");
		System.out.println(obj);
		String msg=obj.toString();
		System.out.println(msg);
		System.out.println("Demo Filter doFilter() PostProcessing Ends");
		
	
	}



	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Demo-Filter init()");
		String cit=fConfig.getInitParameter("city");
		System.out.println(cit);
	}

}

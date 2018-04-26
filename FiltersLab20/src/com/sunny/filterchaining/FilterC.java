package com.sunny.filterchaining;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class FilterC implements Filter {

    /**
     * Default constructor. 
     */
    public FilterC() {
    	System.out.println("FilterC Default Constructor");
    }


	public void destroy() {
		System.out.println("FilterC Destroy()");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("FilterC doFilter Started ");

		// pass the request along the filter chain
		chain.doFilter(request, response);
				
		System.out.println("FilterC doFilter Ended ");
		

	
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterC init() method");

	}

}

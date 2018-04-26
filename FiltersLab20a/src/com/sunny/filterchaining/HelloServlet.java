package com.sunny.filterchaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {


	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("service() method is called in :"+this.getClass().getName());

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<h1>HEY USER <br />");

		
		
	}

	
	@Override
	public void init() throws ServletException {
	System.out.println("init() method is called in :"+this.getClass().getName());
	}




	public void destroy() {
		System.out.println("dstroy() method is called in :"+this.getClass().getName());

	}
}

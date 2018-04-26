package com.sunny.filterchaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("HelloServlet service() Started");
	
		PrintWriter out=response.getWriter();
		out.println("<h1>Verify Server At Console");
		out.println("<h1>Hi Guys How Are You All!!!!!!!!");

		System.out.println("HelloServlet service() Ended");

	}

}

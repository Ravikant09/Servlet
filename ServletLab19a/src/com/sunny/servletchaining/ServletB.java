package com.sunny.servletchaining;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletB extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		System.out.println("Servlet B Started");

		Writer w=response.getWriter();
		w.write("<h2> <br />Verify The Console");
		w.write("<h2> That Sunny is A Good Boy");
		

		System.out.println("Servlet B Ended");

	}

}

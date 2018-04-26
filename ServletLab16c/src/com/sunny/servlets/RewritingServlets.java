package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RewritingServlets extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String str=request.getParameter("name");
	
		PrintWriter pn=response.getWriter();
		pn.println("<h1> Welcome "+str+" Into My Page");
	}

}

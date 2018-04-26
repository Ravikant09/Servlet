package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd1=request.getRequestDispatcher("header.html");
		PrintWriter pn=response.getWriter();
		pn.write("<h2 align=right>Hello Guys!!</h2>");	//If we use these 2 lines after include than we get error
		
	
		rd1.include(request, response);
			
		RequestDispatcher rd2=request.getRequestDispatcher("home.html");
		rd2.include(request, response);
		RequestDispatcher rd3=request.getRequestDispatcher("footer.html");
		rd3.include(request, response);
	}

}

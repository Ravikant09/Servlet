package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {

	@Override
	public void init() throws ServletException {
	System.out.println("init() mtd is called"+this.getClass().getName());
	
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pn=response.getWriter();
		
		String usnm=request.getParameter("username");
		pn.print("WELCOME "+usnm);
		pn.println("<a href='servlet2?uname="+usnm+" '> :VisitHere</a>");		//here with url write = i.e servlet2?uname= otherwise we get Null
		
		pn.close();	
	}

	@Override
	public void destroy() {

		System.out.println("destroy() mtd is called"+this.getClass().getName());

	}

}



//Note:-When We Close Server Than also Destroy Mtd Called
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
		pn.println("Welcome "+usnm);
		
		//Creating From That Have Invisible Text Field
		pn.println("<form action='servlet2'> ");
		pn.println("<input type='hidden' name='usnm' value=' "+usnm +"'/>");
		pn.println("<input type='submit'  value='RunFast' ");
		pn.println("</form>");
		
		pn.close();	
	}

	@Override
	public void destroy() {

		System.out.println("destroy() mtd is called"+this.getClass().getName());

	}

}



//Note:-When We Close Server Than also Destroy Mtd Called
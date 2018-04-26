package com.sunny.listners;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		System.out.println("TestServlet service()");
	
		System.out.println("Accessing Session Object");
		
		HttpSession sess=request.getSession();
		String eml=request.getParameter("email");
		
		ServletContext ctx=getServletContext();
		System.out.println("Storing Attribute in Context");
		ctx.setAttribute("email", eml);
		
		System.out.println("Replacing Attribute in Context");
		ctx.setAttribute("email", "sunny@gmail.com");
		
		System.out.println("Removing Attribute in Context");
		ctx.removeAttribute("email");
		
		System.out.println("Invalidating Session object");
		sess.invalidate();
		Writer w=response.getWriter();
		w.write("<h1>Verify Server Console");
		
	}

}

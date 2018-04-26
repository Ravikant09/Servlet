package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HaiServlet extends HttpServlet {
	ServletConfig cnf=null;
	@Override
	public void init(ServletConfig cnf) throws ServletException {
		// TODO Auto-generated method stub			we are overriding the init method
		this.cnf=cnf;
		
		System.out.println("init() method of HaiServlet");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Service method of HaiServlet");
		
		String nm=request.getParameter("Name");
		String pwd=request.getParameter("Password");
		
		PrintWriter pn=response.getWriter();
		response.setContentType("text/html");
		pn.write("<h1>Response For Hai Servlet</h1>");
		pn.write("<hr />Request Parameter");
		pn.write("<br/>Name :"+nm);
		pn.write("<br/>Password :"+pwd);
		pn.write("<hr />Servlet Config Parameters");

		String lg=cnf.getInitParameter("Login");
		pn.write("<br /> "+cnf);
		pn.write("<br /> Login: "+lg);
		
		pn.write("<hr />Servlet Context Parameters");
		ServletContext ctx=cnf.getServletContext();
		String web=ctx.getInitParameter("website");
		
		pn.write("<br />"+ctx);
		pn.write("<br /> WebSite :"+web);
		
			
}


	static{
		System.out.println("HaiServlet Static Block");
	}

	public HaiServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("HaiServlet Default Constructor");
		
	}


}

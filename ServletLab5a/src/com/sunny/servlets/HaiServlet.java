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

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Service method of HaiServlet");
		
		String nm=request.getParameter("name");
		String phn=request.getParameter("phone");
		
		PrintWriter pn=response.getWriter();
		response.setContentType("text/html");
		pn.write("<h1>Response For Hai Servlet</h1>");
		pn.write("<hr />Request Parameter");
		pn.write("<br/>Name :"+nm);
		pn.write("<br/>Phone :"+phn);
		pn.write("<hr />Servlet Config Parameters");
		ServletConfig cnf=getServletConfig();
		String eml=cnf.getInitParameter("email");
		pn.write("<br /> "+cnf);
		pn.write("<br /> Email: "+eml);
		
		pn.write("<hr />Servlet Context Parameters");
		ServletContext ctx=cnf.getServletContext();
		String web=ctx.getInitParameter("website");
		
		pn.write("<br />"+ctx);
		pn.write("<br /> Web :"+web);
		
			
}

}

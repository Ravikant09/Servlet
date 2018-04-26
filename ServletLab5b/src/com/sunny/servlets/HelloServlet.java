package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class HelloServlet extends HttpServlet {

	static{
		System.out.println("HelloServlet Static Block");
	}

	public HelloServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloServlet Default Constructor");
		
	}

	
	ServletConfig cnf=null;
	@Override
	public void init(ServletConfig cnf) throws ServletException {
		// TODO Auto-generated method stub			we are overriding the init method
		this.cnf=cnf;
		
		System.out.println("init() method of HelloServlet");
	}
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service method of HelloServlet");
		
		String nm=request.getParameter("name");
		String eml=request.getParameter("email");
		String gnd=request.getParameter("gender");
		String phn=request.getParameter("phone");
		String strm=request.getParameter("Streams");
		String strms[]=request.getParameterValues("Streams");
		String enq=request.getParameter("enquiry");
		
		PrintWriter pn=response.getWriter();
		pn.write("<h1>Response For Hello Servlet</h1>");
		pn.write("<hr />Request Parameter");
		pn.write("<br/>Name :"+nm);
		pn.write("<br/>Email :"+eml);
		pn.write("<br/>Gender :"+gnd);
		pn.write("<br/>Phone :"+phn);
		pn.write("<br/>Streams :"+strm);
		pn.write("<br /> All Streams  :");
		if(strms!=null)
			for(String str:strms){
				pn.write("<br />"+str);
			}
		pn.write("<br/>Enquiry :"+enq);
		
		pn.write("<hr />Servlet Config Parameters");

		String rgstr=cnf.getInitParameter("Registration Process");
		pn.write("<br /> "+cnf);
		pn.write("<br /> Registration: "+rgstr);
		
		pn.write("<hr />Servlet Context Parameters");
		ServletContext ctx=cnf.getServletContext();
		String web=ctx.getInitParameter("website");
		
		pn.write("<br />"+ctx);
		pn.write("<br /> Website :"+web);
		
			
	
	}

}


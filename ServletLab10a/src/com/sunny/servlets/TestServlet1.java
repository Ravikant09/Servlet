package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet1 extends HttpServlet {

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	response.setContentLength(1000);
	response.setHeader("Mohan", "YES");
//	response.setBufferSize(3500);

	PrintWriter out=response.getWriter();
	Enumeration e=request.getHeaderNames();		//get all Header names
	while (e.hasMoreElements()) {
		String headername=e.nextElement().toString();
		String headervalue=response.getHeader(headername);
		out.println("<br />"+headername+":"+headervalue);
	}
	
	out.println("<br />ContentType :"+response.getContentType());
	out.println("<h1>Character Encoding	:"+response.getCharacterEncoding());
	out.println("<h1>Buffer Size	:"+response.getBufferSize());
//	response.setBufferSize(5000);	//We cannot setBufferSize after PrintWritter
	out.println("<h1>Buffer Size	:"+response.getBufferSize());

	out.println("<h1>Status	:"+response.getStatus());
	System.out.println("Status	:"+response.getStatus());

	try {
		String str=null;
		int x=str.length();
		
	} catch (Exception e2) {
		// TODO: handle exception
		//e2.printStackTrace();
		System.out.println(e2);
	}
	System.out.println("Status	:"+response.getStatus());

	}

}

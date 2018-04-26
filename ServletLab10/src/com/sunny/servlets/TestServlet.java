package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	//Request Parameter
		String un=request.getParameter("uname");
		String pw=request.getParameter("pwd");
		
	//Display Request Parameter 
		PrintWriter pn=response.getWriter();
		pn.println("<h1>Request Parameter</h1>");
		pn.println("<h1>UserName</h1>"+un);
		pn.println("<h1>Password</h1>"+pw);
		pn.println("<hr />");
		pn.println("Request Headers");
		
	//Request Headers
		
		Enumeration e=request.getHeaderNames();		//get all Header names
		while (e.hasMoreElements()) {
			String headername=e.nextElement().toString();
			String headervalue=request.getHeader(headername);
			pn.println("<br />"+headername+":"+headervalue);
		}
		pn.println("<hr />");
		pn.println("Locale Info");
		//Locale Supported by Bfrowser
		pn.println("<br /> request.getLocale"+request.getLocale());
		pn.println();
		pn.println("<hr />");
		pn.println("Other Info");
		//Other Information for Request
		pn.println("<br />Methods :"+request.getMethod());
		pn.println("<br />Request URI :"+request.getRequestURI());
		pn.println("<br />Request URL :"+request.getRequestURL());
		pn.println("<br />Protocol :"+request.getProtocol());
		pn.println("<br />ContentLength :"+request.getContentLength());
		pn.println("<br />ContentType :"+request.getContentType());
		pn.println("<br />Remote ADDRESS :"+request.getRemoteAddr());
		pn.println("<br />Remote PORT :"+request.getRemotePort());
		pn.println("<br />Remote HOST :"+request.getRemoteHost());
		pn.println("<br /?Remote USER :"+request.getRemoteUser());
		pn.println("<br />Server PORT :"+request.getServerPort());
		pn.println("<br />Server Name :"+request.getServerName());
		pn.println("<br />Server PATH :"+request.getServletPath());
		pn.println("<br />Server CONTEXT :"+request.getServletContext());
		pn.println("<br />QUERY STRING :"+request.getQueryString());
		pn.println("<br />CONTEXT PATH :"+request.getContextPath());
		pn.println("<br />Local Addrress :"+request.getLocalAddr());
		pn.println("<br />Local Name :"+request.getLocalName());
		pn.println("<br />Local Port :"+request.getLocalPort());
		pn.println("<h1>Character Encoding	:"+request.getCharacterEncoding());
		

}

}

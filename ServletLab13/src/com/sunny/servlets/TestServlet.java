package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sess=request.getSession();
		PrintWriter pn=response.getWriter();
		pn.write("<h1><br />ID	:"+sess.getId());
		pn.write("<h1><br />Session Creation Time	:"+sess.getCreationTime());
		pn.write("<h1><br />Last Accessed Time	:"+sess.getLastAccessedTime());
		pn.write("<h1><br />Maximun Inactive Interval	:"+sess.getMaxInactiveInterval());
		pn.write("<h1><br />Session Context	:"+sess.getSessionContext());		//deprecated method
		pn.write("<h1><br />ServletContxt	:"+sess.getServletContext());
		pn.write("<h1><br />Whether Session is New or not	:"+sess.isNew());
		
		
		pn.write("<h1><br />Session Creation Time	:"+sess.getCreationTime());
		pn.write("<h1><br />Last Accessed Time	:"+sess.getLastAccessedTime());
		
		sess.setMaxInactiveInterval(20);		//default inactive time is 30 min but we set to 20 min
		pn.write("<h1><br />Maximun Inactive Interval	:"+sess.getMaxInactiveInterval());
		
		
		
		
	}

}

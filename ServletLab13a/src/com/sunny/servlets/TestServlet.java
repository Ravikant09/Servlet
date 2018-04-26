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
		pn.write("<h1><br />Session New Or Not	:"+sess.isNew());
		
		
		pn.write("<h1><br />Maximun Inactive Interval	:"+sess.getMaxInactiveInterval());
		
		sess.setMaxInactiveInterval(20*60);		//here max inactive will be set in terms of minute so change 
												//to second by multiplying with 60
		
		pn.write("<h1><br />Maximun Inactive Interval	:"+sess.getMaxInactiveInterval());
		
		
		
		
	}

}

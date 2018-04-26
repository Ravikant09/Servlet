package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet implements Servlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Collecting Input Data

	String unm=request.getParameter("username");
		String pwd=request.getParameter("password");
		String msg="";
		
		//Processing Client Data  of servlet
		if(unm.equals(pwd)){
			msg="<h1>Login Success <br/>Welcome To Sunny's Home Page</h1>";
		}
		else
		{
			msg="<h1>Login Failed <br/>Invalid User Name or Password</h1>";
				}
		//Sending the Response
		PrintWriter out=response.getWriter();
		out.write(msg);
		
	}

}

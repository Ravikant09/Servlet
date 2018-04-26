package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="myLogin",urlPatterns={"/login.jlc"})
public class LoginServlet extends HttpServlet implements Servlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Since Protected is used for service so we have to go to login page 1st then to go to home page
		//Collecting Input Data
		
		
		String unm=request.getParameter("username");
		String pwd=request.getParameter("password");
		String msg="";
		
		//Processing Client Data 
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

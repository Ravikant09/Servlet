package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service of LoginServlet");

		String unm=request.getParameter("username");
		String pwd=request.getParameter("password");

		PrintWriter out=response.getWriter();
		out.write("<h1>Before Forwarding");
		String page="";
		if(unm.equals(pwd)){
			page="/WEB-INF/home.html";
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);
			System.out.println("Fully Qualified Class Name of RequestDispatcher :"+rd.getClass().getName());		//or getSimpleName()
			
		}else{
			page="Invalid UserName or Password ";
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);
			System.out.println(rd.getClass().getName());
		}
		out.write("<h1>Before Forwarding");
		System.out.println("service method Last Statement");
	}

}

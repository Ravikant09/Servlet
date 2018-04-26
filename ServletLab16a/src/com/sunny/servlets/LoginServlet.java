package com.sunny.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collect I/P Data 

		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		String rem=request.getParameter("remember");
		System.out.println("Remember Me:"+rem);
	
		//Process 
		String page="";
		if(un.equals(pw)){
			page="home.jsp";
			request.setAttribute("UN", un);
			if(rem!=null || rem.equals("Yes")){
				System.out.println("Adding Cokkies Now");
				Cookie ck1=new Cookie("UNC", un);
				ck1.setMaxAge(0);
				response.addCookie(ck1);
			
				Cookie ck2=new Cookie("PWC", pw);
				ck2.setMaxAge(0);
				response.addCookie(ck2);
			}
		}
		else{
			page="login.jsp";
			request.setAttribute("ErrorMSG", "Invalid UserName Or Password");
		}
	
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

}

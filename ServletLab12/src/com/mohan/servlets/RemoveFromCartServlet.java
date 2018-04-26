package com.mohan.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveFromCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession sess=request.getSession(false);
		if(sess==null){
			request.setAttribute("MSG", "Session is Destroyed");
			
		}
		else {
			String bnm=request.getParameter("bname");
			
			//Removing the Client Selected Book From Session
			
			sess.removeAttribute(bnm);
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("showcart.com");
		rd.forward(request, response);
	}

}

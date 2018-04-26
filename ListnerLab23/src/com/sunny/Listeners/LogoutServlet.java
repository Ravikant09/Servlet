package com.sunny.Listeners;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sess=request.getSession(false);
		if(sess!=null)
			sess.invalidate();
		
		RequestDispatcher rd=request.getRequestDispatcher("logout.jsp");	//if logout.hmtl than session will not be created 
			rd.forward(request, response);

	}

}

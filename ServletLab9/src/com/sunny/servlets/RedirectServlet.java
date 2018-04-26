package com.sunny.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String pg=request.getParameter("page");
		if(pg==null || pg.trim().length()==0){		//use trim so that remove the white space also 
			RequestDispatcher rd=null;
			rd=request.getRequestDispatcher("error.html");
			rd.forward(request, response);
			return;							//we can use return without any type
		}
		if(pg.startsWith("www")){
			pg="http://"+pg;
		}
		response.sendRedirect(pg);
	
	}

}

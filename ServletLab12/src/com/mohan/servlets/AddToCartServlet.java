package com.mohan.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		System.out.println("Add To Cart");
		String bn=request.getParameter("bname");
		System.out.println(bn);
		
		//Accessing The Existing Session Object 
		HttpSession sess=request.getSession(false);
		
		//Validating session available or not
		if(sess==null){
			request.setAttribute("MSG", "Session is Destroyed");
		}else {
			String bnm=request.getParameter("bname");
			
			//Adding to client selected book to session
			sess.setAttribute(bnm, bnm);
			request.setAttribute("Added", bnm+"is added to cart");
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("showbooks.jsp");
		rd.forward(request, response);

	}

}

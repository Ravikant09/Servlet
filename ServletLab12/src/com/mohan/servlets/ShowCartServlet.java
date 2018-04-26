package com.mohan.servlets;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ShowCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sess=request.getSession(false);
		if(sess==null){
			request.setAttribute("MSG", "Session is Destroyed");
			RequestDispatcher rd=request.getRequestDispatcher("showbooks.jsp");
			rd.forward(request, response);
		}
		else {
			Enumeration<String> enms=sess.getAttributeNames();
			List<String> selectedlist=Collections.list(enms);
			selectedlist.remove("BOOKS");
			
			if(selectedlist.size()==0){
				request.setAttribute("MSG", "NO BOOKS SELECTED");
			}
			else{
				request.setAttribute("CART",selectedlist);
			}
			RequestDispatcher rd=request.getRequestDispatcher("showcart.jsp");
			rd.forward(request, response);
		}
	}

}

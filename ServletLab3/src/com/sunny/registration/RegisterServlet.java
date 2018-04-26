package com.sunny.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	System.out.println("service()");
	
	//1.Collect the data 
	String nm=request.getParameter("name");
	String em=request.getParameter("email");
	String gnd=request.getParameter("gender");
	String phn=request.getParameter("phone");
	String tim=request.getParameter("timings");
	String crs=request.getParameter("course");
	String[] cours=request.getParameterValues("course");	//since have more than one number of courses so String Array
	String re=request.getParameter("ramarks");

	
	//2.Process the data store in DB
	
	String msg="Your Enquiry Has Been Added Successfully";
	System.out.println("Name :"+nm);
	System.out.println("Email :"+em);
	System.out.println("Gender :"+gnd);
	System.out.println("Phone :"+phn);
	System.out.println("Timing :"+tim);
	System.out.println("Course :"+crs);
	System.out.println("All Courses:");

	if(cours!=null)
			for(String c:cours){
				System.out.println(c);
			}
	System.out.println("Remarks :"+re);
	
	//Sending the response to the Client
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h1>Java Learning Cenetr</h1>");
	out.println("<h1>" + msg +"</h1>");
	out.println("<h1>Full Name :</h1>"+nm);
	out.println("<h1>Email :</h1>"+em);
	out.println("<h1>Gender :</h1>"+gnd);
	out.println("<h1>Phone :</h1>"+phn);
	out.println("<h1>Timing :</h1>"+tim);
	out.println("<h1>Course :</h1>"+crs);
	out.println("<h1>All Courses :</h1>");
	
	if(cours!=null)
		for(String c:cours){
			out.println("<br />"+c);
		}

	
	out.println("<h1>Remarks :</h1>"+re);
	
	
	
	}
	

}

package com.sunny.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="regServlet",urlPatterns={"/register.jlc"})
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
	String re=request.getParameter("remarks");

	
	//2.Process the data store in DB
	
	String msg="Your Enquiry Has Been Added Successfully";
	System.out.println("Name :"+nm);
	System.out.println("Email :"+em);
	System.out.println("Gender :"+gnd);
	System.out.println("Phone :"+phn);
	System.out.println("Timing :"+tim);
	System.out.println("Course :"+crs);
	System.out.println("All Courses");

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
	out.println("<h3>Full Name :</h3>"+nm);
	out.println("<h3>Email :</h3>"+em);
	out.println("<h3>Gender :</h3>"+gnd);
	out.println("<h3>Phone :</h3>"+phn);
	out.println("<h3>Timing :</h3>"+tim);
	out.println("<h3>Course :</h3>"+crs);
	out.println("<h3>All Courses :</h3>");
	
	if(cours!=null)
		for(String c:cours){
			out.println("<br />"+c);
		}

	
	out.println("<h3>Remarks :</h3>"+re);
	
	
	
	}
	

}

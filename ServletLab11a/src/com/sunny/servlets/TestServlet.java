package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	
	static int count=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;		//count:-To Check HowMany Time Service Method is Called
		System.out.println("Service Methods	:"+count);
		PrintWriter w=response.getWriter();
		
		w.write("<br />Service Methods	:"+count);
			if(count<=10){
			
			response.setHeader("Refresh", "1");		//response:-To Send Request to Current URL
													//Refresh:-It Is Also A header Name used to Refresh 
													//Client Browser Automatically
													//1:-Header value(times in terms of second)
		w.println("<br />"+new Date());
		}
		else{
			response.setHeader("Refresh", "1,URL=http://www.youtube.com/");
		}
	
	}

}

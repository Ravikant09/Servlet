package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name="demoFilter",
		urlPatterns={"/demo.sunny"},
		initParams={
				@WebInitParam(name="city",value="Silchar")
		}
	)

public class DemoServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Demo Servlet service() Begins");
		String nm=request.getParameter("name");
		String em=request.getParameter("email");
		String ip=request.getRemoteAddr();
		
		String msg="<h1>Hello!!!"+nm+"<br />"+"Your Email ID is :"+em+"<br />";
		msg=msg+"You Are Sending the request from IP ADDRESS :"+ip;
		request.setAttribute("MSG", msg);
		PrintWriter pw=response.getWriter();
		pw.println(msg);
		System.out.println("Demo Servlet service() Ends");

	}

	@Override
	public void init(ServletConfig sc) throws ServletException {

		System.out.println("DemoServlet init()");
		String cit=sc.getInitParameter("city");
		System.out.println(cit);
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DemoServlet Destroy()");
	}

}


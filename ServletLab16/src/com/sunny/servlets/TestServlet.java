package com.sunny.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();		//create session object and by default name is JSESSIONID

		
		Cookie cks[]=request.getCookies();
		pw.println("<h1>"+cks);
		boolean jsessidflag=false;
		boolean sunnyflag=false;
		
		if(cks==null || cks.length==0){
			pw.println("<h1>OOPSSS..................No Cookies Found</h1>"+cks.length);
		}else{
			for(Cookie ck:cks){
				String cname=ck.getName();
				String cvalue=ck.getValue();
				pw.println("<h1>"+cname+"\t\t"+cvalue+"</h1>");
				
				if(cname.equals("JSESSIONID")){
					jsessidflag=true;
				}
				if(cname.equals("SUNNY")){
					sunnyflag=true;
					ck.setMaxAge(0);
					response.addCookie(ck);
				}
			}
		}

		if(jsessidflag)
			pw.println("<h1>JSESSIONID COOKIE FOUND......</h1>");
		else 
			pw.println("<h1>JSESSIONID COOKIE NOT FOUND......</h1>");

		
		if(sunnyflag)
			pw.println("<h1>SUNNY COOKIE FOUND......</h1>");
		else 
			pw.println("<h1>SUNNY COOKIE NOT FOUND......</h1>");

		Cookie c1=new Cookie("SUNNY", "WELCOME TO SUNNY'S WORLD");
		response.addCookie(c1);

		Cookie c2=new Cookie("EMAIL", "Mohan@gmail.com");
		response.addCookie(c2);
		
		Cookie c3=new Cookie("PHONE", "8759167520");
		response.addCookie(c3);
		
	}

}

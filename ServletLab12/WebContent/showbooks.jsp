<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@ page import="java.util.*" %>
<html>

<body>
<center>
<h1>Sunny's Book Store</h1>
<h2>Book Search</h2>
<font color="blue" size="6">Added</font>
</center><br />

<% Object obj=request.getAttribute("MSG");
if(obj!=null){%>
<br /><center>
<font color="red" size="6"><%=obj %></font>
<br /> <a href="index.jsp"> Go To Search Page</a>
</center>
<%
			}
	else{
		obj=session.getAttribute("BOOKS");
		
		ArrayList<String> blist=(ArrayList<String>)obj;	//since Object obj is super class so type cast
		for(String bnm:blist){
	
%>

<form action="addtocart.com" method="post">
<input type="hidden" name="bname" value="<%=bnm%>"/> 
<font size="5"><%=bnm%>
<input type="submit" value="Add To Cart">

</font>
</form>

<% }  %>

<br />
<form action="showcart.com">
<input type="submit" value="SHOW CART"/>
</form>

<% }  %>



</body>
</html>
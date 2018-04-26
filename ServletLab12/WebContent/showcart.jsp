<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@ page import="java.util.*" %>
<html><body>
<center>
<h1>Sunny's Book Store</h1>
<h2>Book Search</h2>
</center>


<%Object obj=request.getAttribute("MSG"); 
if(obj!=null){ %>
<br /><center><font color="red" size="6"><%=obj %></font></center>

<%
}
else{
	obj=request.getAttribute("CART");
	ArrayList<String> blist=(ArrayList<String> )obj;
	
	for(String bnm:blist){
	
%>

<form action="removefromcart.com" method="post">
<input type="hidden" name="bname" value="<%=bnm%>"/>
<font size="5" ><%=bnm %><input type="submit" value="Remove From CART"/></font>
</form>
<%	} %>
<br /><center><a href="placeorder.jsp">Place Order</a></center>
<% } %>

<center><br /><a href="showbooks.jsp">ADD To CART</a></center>


</body>
</html>
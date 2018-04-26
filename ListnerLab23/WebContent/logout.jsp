

<%@page session="false" %>
<html>

<body>
<h1>Welcome TO Sunny's World</h1>
<table align="right">

<tr> 

<td><h1>Total Visited :<%=application.getAttribute("TV") %></h1></td>

</tr>


<tr> 

<td><h1>Total Active :<%=application.getAttribute("TA") %></h1></td>

</tr>

</table>
<br /><br />
<h1>You Have Logged Out Successfully</h1>
<br /><br />

<a href="index.jsp">Go to Index Page</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
<center>
<h1>Sunny's Book Store</h1>
<h2>Books Search</h2>
<form action="searchbook.com" method="post">
<table><tr><td><h2>Select Category</h2></td></tr>
<tr><td>
<select name="category">

<option value="Select">Select</option>
<option value="Java">Java</option>
<option value="Testing">Testing</option>
<option value=".NET">.NET</option>
<option value="SAP">SAP</option>


</select>
</td></tr>


<tr><td><input type="submit" value="SearchBooks"/></td></tr>

</table>


</form>
</center>


</body>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>

<h1>SunnyTutorial</h1>
<h2>User Login</h2>

<%
Object obj=request.getAttribute("UN");
String msg="";
if(obj!=null){
	msg=obj.toString();
	
}

String un="";
String pw="";

Cookie cks[]=request.getCookies();
if(cks!=null){
	for(Cookie ck:cks){
		String cn=ck.getName();
		if(cn.equals("UNC"))
			un=ck.getValue();
		
		if(cn.equals("PWC"))
			pw=ck.getValue();
		
	}
}
%>

<font color="red" size="6"><%=msg %></font>
<form action="myLogin.sunny" method="post">
<table>

<tr>
<td>UserName</td>
<td><input type="text" name="username" value="<%=un%>"/></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" value="<%=pw%>"/></td>
</tr>

<tr><td> <input type="submit" value="Login Now" /> </td></tr>

<tr><td> <input type="checkbox" name="remember" value="Yes" />Remember Me </td></tr>

</table>
</form>
</body>
</html>
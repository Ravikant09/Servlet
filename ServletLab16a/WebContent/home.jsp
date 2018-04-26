
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>

<h1>Sunny's Tutorial</h1>
<%
Object obj=request.getAttribute("UN");
String un="";
if(obj!=null){
	un=obj.toString();
}

%>

<h2><marquee>Hello <%=un %> Welcome To Sunny's Tutorial</marquee></h2>
<h2>THIS IS MY HOME PAGE</h2>
</body>
</html>
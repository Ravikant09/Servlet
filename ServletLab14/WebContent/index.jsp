<!DOCTYPE html>
<html>

<body>
<br />Id:<%=session.getId() %>
<br />Id isNew:<%=session.isNew() %>
<br /><% session.setMaxInactiveInterval(10);%> 

<h1><a href="test.com">Test</a></h1>
</body>
</html>
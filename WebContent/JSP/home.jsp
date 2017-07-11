<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/CSS/layout.css">
<title>Insert title here</title>
</head>
<body>

<div id="d1">
<img id="i2" src="<%=request.getContextPath()%>/IMG/crown.jpg" alt="crown">
<h1 id="title">Roshan Hotel</h1>
</div>

<div id="d2">
<ul>
  <li><a class="active" href="<%=request.getContextPath()%>/JSP/home.jsp">Home</a></li>
  <li><a href="<%=request.getContextPath()%>/JSP/about.jsp">About</a></li>
  <li><a href="<%=request.getContextPath()%>/JSP/accommodation.jsp">Accommodation</a></li>
  <li><a href="<%=request.getContextPath()%>/JSP/gallery.jsp">Gallery</a></li>
  <li><a href="<%=request.getContextPath()%>/JSP/log_page.jsp">Log In</a></li>
  <li><a href="<%=request.getContextPath()%>/JSP/contact.jsp">Contact</a></li>
</ul>
</div>

<div id="d3">
<img id="i1" src="<%=request.getContextPath()%>/IMG/inside.jpg" alt="hall">
</div>

<footer>
  <p>Create by Agata &copy; </p>
</footer>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/CSS/LogStyle.css">
<title>Insert title here</title>
</head>
<body>
<div class="login">
<h2>Log In</h2>
 <fieldset>  
<form action="<%=request.getContextPath()%>/LogControl?action=logIn" method="post">
Username:<label id="as" value="*">*</label><br>
<input type="text" placeholder="User Name" name="uname" required/>
Password:<label id="as" value="*">*</label><br>
<input type="password" placeholder="Password" name="pass" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" required/>
</fieldset>
<input type="Submit" name="log_in" value="Log in"/>

<div class="utilities">

<a href="<%=request.getContextPath()%>/JSP/newUser_page.jsp" >Sign UP &rarr;</a>
</div>
</form>
</div>

</body>
</html>
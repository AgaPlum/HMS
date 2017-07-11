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
<h2>Sign Up</h2>
 <fieldset>  
<form action="<%=request.getContextPath()%>/LogControl?action=newUser" method="get">
Name:<label id="as" value="*">*</label><br>
<input type="text" name="name" placeholder="Name" required/>
Username:<label id="as" value="*">*</label><br>
<input type="text" name="uname" placeholder="User Name" required/>
Password:<label id="as" value="*">*</label> <br>
<input type="password" name="pass1" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" required/>
Confirm Password:<label id="as" value="*">*</label> <br>
<input type="password" name="pass2" placeholder="Confirm Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" required/>
Email:<label id="as" value="*">*</label><br>
<input type="text" name="mail" placeholder="E-Mail" pattern="[A-Za-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required/>
Contact Number:<label id="as" value="*">*</label><br>
<input type="text" name="connum" placeholder="Contact Number" pattern="[+][0-9]{11,}" title="Start with + and your country code" required/>
</fieldset>
Are you admin:<label id="as" value="*">*</label><br>
Yes<input type="radio" name="admin" value="Yes"/>
No<input type="radio" name="admin" value="No"/>
<br>
<br>
<input type="submit" name="sign_up" value="Create Account"/>
<div class="utilities">
<input type="reset" name="reset" value="Reset" />
</div>
</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!--  화면에 데이터를뿌려주는 역할  -->
   <!-- View 에 해당 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Join form</h2>
<form action="Mproc2" method="post">
<table width="400" border="1">
<tr height="40">
<td width="150">id</td>
<td width="150"> <input type="text" name="id"> </td>
</tr>
<tr height="40">
<td width="150">password</td>
<td width="150"> <input type="password" name="password"> </td>
</tr>
<tr height="40">
<td width="150">email</td>
<td width="150"> <input type="email" name="email"> </td>
</tr>
<tr height="40">
<td width="150">tel</td>
<td width="150"> <input type="tel" name="tel"> </td>
</tr>
<tr height="40">
<td width="150">address</td>
<td width="150"> <input type="text" name="address"> </td>
</tr>
<tr height="40" >
<td width="150" colspan="2" align="center"> <input type="submit" value="submit"> </td>
</tr>
</table>
</form>
</center>
</body>
</html>
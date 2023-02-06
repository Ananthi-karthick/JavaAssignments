<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="dao.RankDao"%>
<%@page import="model.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Dates</title>
<style>
body {
	background-image:
		url('data:image/jpeg;base64,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');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
	
}
table {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  
}
table td,th {
 
  padding: 8px;
  text-align:center;
  font-size:20px;
}
button {
margin-top:20px;
padding: 10px 30px;
background-color: #00FFFF;
	cursor: pointer;
	font-size: 25px;
	color:black;
	border-radius: 30px;
	
}
</style>
</head>
<body>
<div align="center">
<h2>Recently Attended Dates</h2>
<table>
<tr>
<th>Dates</th>
</tr>
<%
int user_id=(int)session.getAttribute("user_id");
String[] dates=RankDao.getDates(user_id);
for(int i=0;i<dates.length;i++){
	if(dates[i]!=null){
%> 
<tr>
<td><a href="ViewResult.jsp?date=<%=dates[i]%>"><%=dates[i]%></a></td>
</tr>
<%
	}
} %>
</table>
 <button type="button" onclick="location.href='UserPanel.html'">Cancel</button> 
</div>
</body>
</html>
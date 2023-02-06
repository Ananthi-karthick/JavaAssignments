<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="dao.RankDao" %>
    <%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>

</head>
<body >
<%

int user_id=(int)session.getAttribute("user_id");

int count=RankDao.checkCount(user_id);


if(count<=3)
{
	response.sendRedirect("Instruction.html");
}
else
{
%>
<script>alert('Sorry!!You were already attended the test 3 times.Cannot attend any more');
history.back()
</script>

<%} 
session.setAttribute("count",count);

%>



</body>
</html>
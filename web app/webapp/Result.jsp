<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="dao.*"%>
<%@page import="model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
    margin: 0;
    font-family: 'Poppins', sans-serif;
}
body {
    background-image:
		url('data:image/jpeg;base64,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');
	
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
    align-items: center;
    background-color: #fff;
}

.content {
    padding: 50px 50px;
}

.popup {
    position: fixed;
    width:100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.4);
    display: grid;
    place-content: center;
    opacity: 0;
    pointer-events: none;
   
}
.popup-content {
    width: 500px;
    background-color: #fff;
    padding: 20px 20px;
    border-radius:15px;
    position: relative;
   
}
.popup h1 {
    position: absolute;
    top: 20px;
    right: 20px;
    font-size :20px;
    cursor: pointer;
   
}


.showPopup {
    opacity: 1;
    transform: translate(0,0);
    pointer-events: auto;
}
button {
margin-top:20px;
	padding: 10px 30px;
	background: #00FFFF;
	cursor: pointer;
	font-size: 18px;
	color:black;
	border-radius: 30px;
	
}
table {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  
}
table td,th {
  border: 1px solid #333;
  padding: 8px;
  text-align:center;
  font-size:20px;
}

</style>
</head>
<body>
<%
String[] dbans = new String[100];
ArrayList<String> answers =(ArrayList<String>)session.getAttribute("answer");
ArrayList<String> questions =(ArrayList<String>)session.getAttribute("questions");  
int i = 0;
int size = answers.size();
for(String answer :answers )
{   
	dbans[i] = answer;
	  i++;
}
String[] userans = new String[100];
for(int j = 0 ; j < size ; j++)
{
	userans[j] = request.getParameter(Integer.toString(j));
}
int correctanswer=0;
int unattempted = 0;
int wronganswer=0;
for(int k = 0 ; k< size;k++)
{
	if(userans[k].equals(dbans[k]))
	{
		correctanswer++;
	}
	else if(userans[k].equals("Not Attend"))
	{
		unattempted++;
	}
	else
	{
		wronganswer++;
	}
}

if(correctanswer>=10)
{
	%>
	<div class="popup" id="popup">
        <div class="popup-content" id="popup-content h1">
            <h1>X</h1>
            <h2><font color="Green">Good Job</font>
              <i class="fa fa-trophy" style="font-size:36px"></i>
            </h2>
           
        </div>
    </div>
    <%
}
else if(correctanswer>=7 && correctanswer<10 )
{
	%>
	<div class="popup" id="popup">
        <div class="popup-content" id="popup-content h1">
            <h1>X</h1>
            <h2>Nice Job
            <i class='fa-solid fa-hands-clapping' style="font-size:36px"></i>
            </h2>
           
        </div>
    </div>
    <%
}
else{
	%>
	<div class="popup" id="popup">
        <div class="popup-content" id="popup-content h1">
            <h1>X</h1>
            <h2>Oops...Need more practice
            <i class='fas fa-frown' style="font-size:36px"></i>
            </h2>
        </div>
    </div>
    <%
}
int attempted = size - unattempted;
int user_id=(int)session.getAttribute("user_id");
String user_name=(String)session.getAttribute("username");
int count=(int)session.getAttribute("count");
LocalDate now= LocalDate.now();
String attendDate=now.format(DateTimeFormatter.ISO_DATE);
Score score=new Score(attendDate,user_id,user_name,correctanswer);
RankDao.addDate(score);
int x=0,y=0,z=0;
boolean status=false;
while(x<questions.size() && y<answers.size() && z<userans.length)
{   
	String question=questions.get(x);
	String answer=answers.get(y);
	String userAns=userans[z];
	
	Result result=new Result(user_id,question,answer,userAns,attendDate);
	 status=ResultDao.insertResult(result);
	
	x++;y++;z++;
}

%>
<div class="content" align="center">
<div ><h1>Results</h1></div>
<br>
<br>
<table >
  
    <tr >
     <h4>Name:  <u><%=session.getAttribute("username") %></u>  || Userid:  <u><%=session.getAttribute("user_id") %></u></h4>
    </tr>
 <br>
 <br>
  
    <tr>
     
      <th>Total no. of Questions</th>
       <th>Number Of Questions Attempted</th>
        <th>Number of Wrong Answers</th>
         <th>Number of Correct Answers</th>
    </tr>
    <tr>
     <td><%=size %></td>
      <td><%=attempted %></td>
       <td ><h4><font color="red"><%=wronganswer %></font></h4></td>
       <td ><h4><font color="green"><%=correctanswer %></font></h4></td>
    </tr>
    
</table>


<button type="submit"  onclick="location.href='ViewAnswer.jsp'" >View Answer</button><br><br>
<button type="submit"  onclick="location.href='UserLogout'"  >Exit</button>

</div>


  <script>
        const popup = document.getElementById('popup');
        const x = document.getElementById('popup-content h1');

        window.addEventListener('load', () => {
            popup.classList.add('showPopup');
            popup.childNodes[1].classList.add('showPopup');
        })
        x.addEventListener('click', () => {
            popup.classList.remove('showPopup');
            popup.childNodes[1].classList.remove('showPopup');
        })
    </script>
</body>
</html>

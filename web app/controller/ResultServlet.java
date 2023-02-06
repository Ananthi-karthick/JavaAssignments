package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] dbans = new String[100];
		 HttpSession session = request.getSession();
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

	}

}

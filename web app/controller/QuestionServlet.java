package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QuestionDao;
import model.Question;



public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String question = request.getParameter("Question");
		String a = request.getParameter("option1");
		String b = request.getParameter("option2");
		String c = request.getParameter("option3");
		String d = request.getParameter("option4");
		String answer = request.getParameter("answer");

		Question questions = new Question();
		questions.setQuestion(question);
		questions.setA(a);
		questions.setB(b);
		questions.setC(c);
		questions.setD(d);
		questions.setCorrectAnswer(answer);
		

		boolean status = QuestionDao.insertQuestion(questions);

		if (status) {
			out.println("Question Added Successfully");
			response.sendRedirect("AddQuestion.html");
		} else {
			out.println("Question not Added");
			response.sendRedirect("AddQuestion.html");
		}

	}

	
		

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		long contactNo =Long.parseLong(request.getParameter("contactNo"));
		String userName=request.getParameter("uname");
		String password = request.getParameter("password");
		

		User user = new User(name, email, contactNo, userName, password);
		boolean status = UserDao.register(user);
		if(status)
		{
			String msg1 = "User Added";
	    	response.sendRedirect("UserLogin.html?msg1="+msg1);
		}
		else
		{
			String msg2 = "User not Added";
	    	response.sendRedirect("Register.html?msg2="+msg2);
		}

		
	}

}

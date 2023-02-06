package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;


public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		int user_id = UserDao.doValidate(user);
		request.setAttribute("u_id",user_id);
		if (user_id!=0) {
			 HttpSession usersession = request.getSession();
			 usersession.setAttribute("username", user.getUserName());
			 usersession.setAttribute("user_id", user_id);
			response.sendRedirect("UserPanel.html");
		} else {
			pw.println("Invalid User Name and Password");
			response.sendRedirect("UserLogin.html" );
		}

	}

}

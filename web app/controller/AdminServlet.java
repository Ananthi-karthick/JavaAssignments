package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Admin;
import dao.AdminDao;


public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Admin admin = new Admin();
		admin.setName(name);
		admin.setPassword(password);
		boolean status = AdminDao.validate(admin);

		if (status) {
			response.sendRedirect("AdminPanel.html");
		} else {
			
			response.sendRedirect("AdminLogin.html");
		}

	}

}
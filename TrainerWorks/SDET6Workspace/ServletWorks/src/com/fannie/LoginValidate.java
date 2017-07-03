package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/ServletWorks
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Assuming that you connect to db
		if (userName.equals("fannie") && password.equals("reston")) {
			request.getRequestDispatcher("Success").forward(request, response);
		} else {
			request.getRequestDispatcher("Failure").include(request, response);
			request.getRequestDispatcher("/LoginForm.html").include(request, response);
		}

	}

}

package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hii")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init() throws ServletException {
		System.out.println("Init Called>>>");
	}


	public void destroy() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Destroy Called......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Welcome to Servlets</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}












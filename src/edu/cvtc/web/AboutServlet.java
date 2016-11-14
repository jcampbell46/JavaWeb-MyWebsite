package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/AboutServlet")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.append("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<title>Jordan's Website</title>\n\t</head>\n\t<body>");
		out.append("\n\t\t<h1><strong>About</strong></h1>");
		out.append("\n\t\t<nav>");
		out.append("\n\t\t\t<ul>");
		out.append("\n\t\t\t\t<li><a href='http://localhost:8080/MyWebsite/Home'>Home</a></li>");
		out.append("\n\t\t\t\t<li><a href='http://localhost:8080/MyWebsite/AboutServlet'>About</a></li>");
		out.append("\n\t\t\t\t<li><a href='http://localhost:8080/MyWebsite/ContactServlet'>Contact</a></li>");
		out.append("\n\t\t\t</ul>");
		out.append("\n\t\t</nav>");
		out.append("\n\t\t<br><br>");
		out.append("\n\t\t<p>Hello, my name is Jordan Campbell. I am currently enrolled in both developer programs, and will graduate with both degrees in May. "
				+ "My wife and I recently had our second son, so that's been keeping me pretty busy on top of school and work. I'm currently interning at " 
				+ " Menards on their mobile development team.</p>");
		out.append("\n\t\t<br><br>");
		out.append("\n\t\t<p>&copy; Copyright 2016 Jordan Campbell</p>");
		out.append("\n\t</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

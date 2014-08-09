package com.baron.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("<HTML>");
		response.getWriter().write("<BODY>");
		response.getWriter().write("<H1>Hello, Servlet!</H1>");
		response.getWriter().write("</BODY>");
		response.getWriter().write("</HTML>");
	}
	
}
package com.anshul.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/date")
public class DateServlet extends HttpServlet {
    private static final REST_URL = "https://www.equifax.com/getScores";

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
                 int i = 10;
		// set response content type
		res.setContentType("text/html");
		// Get PrintWriter object
		PrintWriter pw = res.getWriter();
		// write response
		Date d = new Date();
		pw.println("<b><i><center>Date and Time is" + d + "</b></i></center>");
		// close stream
		pw.close();
	}// service(-,-)
}// class

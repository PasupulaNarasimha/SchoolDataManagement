package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/invalidadmin")
public class InvalidAdmin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter w = resp.getWriter();
		w.write("<h1 align=\"center\">"+"Invalid User Name or Password"+"</h1>");
 		w.write("<h3>"+"To Go to Admin Login(<a href=adminlogin.jsp>Click Here</a>)"+"</h3>");

	}
}


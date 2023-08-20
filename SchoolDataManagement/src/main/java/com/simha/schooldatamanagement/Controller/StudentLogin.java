package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.StudentDAOImp;
import com.simha.schooldatamanagement.dto.Student;
import com.simha.schooldatamanagement.repository.*;

@WebServlet("/studentlogin")
public class StudentLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		PrintWriter w = resp.getWriter();
		StudentDAO dao = new StudentDAOImp();
		Student s = dao.studentLogin(email, pass);
		if(s.getName()!=null) {
			w.write("<h1 align=\"center\">"+"Welcome "+s.getName()+"</h1>");
			w.write(s.toString());
		}
		else {
			w.write("<h1 align=\"center\">"+"Invalid UserName or Password"+"</h1>");
	 		w.write("<h3>"+"To Go to Student Login(<a href=studentlogin.jsp>Click Here</a>)"+"</h3>");

		}
	}
}

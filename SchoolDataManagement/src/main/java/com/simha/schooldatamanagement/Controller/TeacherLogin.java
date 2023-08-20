package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.TeacherDAOImp;
import com.simha.schooldatamanagement.dto.Teacher;
import com.simha.schooldatamanagement.repository.*;

@WebServlet("/teacherlogin")
public class TeacherLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		PrintWriter w = resp.getWriter();
		TeacherDAO dao = new TeacherDAOImp();
		Teacher t = dao.TeacherLogin(email, pass);
		if(t.getName()!=null) {
			w.write("<h1 align=\"center\">"+"Welcome "+t.getName()+"</h1>");
			w.write(t.toString());
		}
		else {
			w.write("<h1 align=\"center\">"+"Invalid UserName or Password"+"</h1>");
	 		w.write("<h3>"+"To Go to Teacher Login(<a href=teacherlogin.jsp>Click Here</a>)"+"</h3>");

		}
	}
}

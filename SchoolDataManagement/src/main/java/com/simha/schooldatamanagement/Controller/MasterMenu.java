package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mastermenu")
public class MasterMenu extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter w = resp.getWriter();
		Object value = req.getAttribute("master");
		System.out.println(value);
		w.write("<h1 align=\"center\">"+"Welcome Master Admin menu"+"</h1>");
		w.write("<h3>"+"Add New Admin(<a href=saveAdmin.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Add New Teacher(<a href=saveTeacher.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Add New Student(<a href=saveStudent.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Update Admin(<a href=updateAdmin.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Update Teacher(<a href=updateTeacher.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Update Student(<a href=updateStudent.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"To Get Admin By Id(<a href=getAdminById.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"To Get Teacher By Id(<a href=getTeacherById.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"To Get Student By Id(<a href=getStudentById.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Get Total Admin Data(<a href=getAllAdmin?>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Get Total Teacher Data(<a href=getAllTeacher?>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"Get Total Student Data(<a href=getAllStudent?>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"To Delete Admin By Id(<a href=deleteAdminById.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"To Delete Teacher By Id(<a href=deleteTeacherById.jsp>Click Here</a>)"+"</h3>");
		w.write("<h3>"+"To Delete Student By Id(<a href=deleteStudentById.jsp>Click Here</a>)"+"</h3>");
	}
}


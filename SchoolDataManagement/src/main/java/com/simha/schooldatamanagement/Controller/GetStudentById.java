package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.StudentDAOImp;
import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.dto.Student;
import com.simha.schooldatamanagement.repository.*;

@WebServlet("/getStudentById")
public class GetStudentById extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDAO dao = new StudentDAOImp();
		Student student = dao.getStudentById(id);
		PrintWriter w = resp.getWriter();
		w.write("<h1>"+"Student Data"+"</h1>");
		w.write(student.toString());
	}
}

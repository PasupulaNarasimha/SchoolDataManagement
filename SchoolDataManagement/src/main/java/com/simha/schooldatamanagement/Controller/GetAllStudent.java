package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.StudentDAOImp;
import com.simha.schooldatamanagement.dto.Student;
import com.simha.schooldatamanagement.repository.*;

@WebServlet("/getAllStudent")
public class GetAllStudent extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StudentDAO dao = new StudentDAOImp();
	List<Student> list = dao.getAllStudent();
	PrintWriter w = resp.getWriter();
	w.write("<h1>"+"Total Student Data"+"</h1>");
	for(Student a:list)
	{
		w.write(a.toString());
		w.write("<br>");
	}
	}
}

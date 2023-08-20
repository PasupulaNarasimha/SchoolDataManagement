package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.TeacherDAOImp;
import com.simha.schooldatamanagement.dto.Teacher;
import com.simha.schooldatamanagement.repository.*;

@WebServlet("/getAllTeacher")
public class GetAllTeacher extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	TeacherDAO dao = new TeacherDAOImp();
	List<Teacher> list = dao.getAllTeacher();
	PrintWriter w = resp.getWriter();
	w.write("<h1>"+"Total Teacher Data"+"</h1>");
	for(Teacher a:list)
	{
		w.write(a.toString());
		w.write("<br>");
	}
	}
}

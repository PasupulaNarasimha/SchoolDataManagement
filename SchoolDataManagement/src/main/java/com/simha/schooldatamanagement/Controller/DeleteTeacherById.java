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

@WebServlet("/deleteTeacherById")
public class DeleteTeacherById extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		TeacherDAO dao = new TeacherDAOImp();
		String t = dao.deleteTeacherById(id);
		PrintWriter w = resp.getWriter();
		w.write("<h1>"+"Teacher Data"+"</h1>");
		w.write(t);
	}
}

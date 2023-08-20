package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.AdminDAOImp;
import com.simha.schooldatamanagement.Imp.StudentDAOImp;
import com.simha.schooldatamanagement.Imp.TeacherDAOImp;
import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.dto.Student;
import com.simha.schooldatamanagement.dto.Teacher;
@WebServlet("/saveAdmin")
public class SaveAdmin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String dept = req.getParameter("dept");
		String pass = req.getParameter("pass");
		 
		AdminDAOImp dao = new AdminDAOImp();
		Admin a = new Admin();
		a.setId(id);
		a.setName(name);
		a.setEmail(email);
		a.setDept(dept);
		a.setPassword(pass);
		
		PrintWriter w = resp.getWriter();
		w.write("<h1>"+"Admin Data is Saved"+"</h1>");
		w.write(dao.saveAdmin(a));
	}
}

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

import com.simha.schooldatamanagement.Imp.StudentDAOImp;
import com.simha.schooldatamanagement.dto.Student;
@WebServlet("/updateStudent")
public class UpdateStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int std = Integer.parseInt(req.getParameter("std"));
		String sec = req.getParameter("sec");
		Date dob = Date.valueOf(req.getParameter("dob"));
		String tp = req.getParameter("tp");
		String pass = req.getParameter("pass");
		 
		StudentDAOImp dao = new StudentDAOImp();
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setStd(std);
		s.setSec(sec);
		s.setDob(dob);
		s.setThroughtPercentage(tp);
		s.setPassword(pass);
		
		PrintWriter w = resp.getWriter();
		w.write("<h1>"+"Student Data is Updated"+"</h1>");
		w.write(dao.updateStudent(s));
	}
}

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

import com.simha.schooldatamanagement.Imp.TeacherDAOImp;
import com.simha.schooldatamanagement.dto.Teacher;
@WebServlet("/updateTeacher")
public class UpdateTeacher extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String sub = req.getParameter("sub");
		double sal = Double.parseDouble(req.getParameter("sal"));
		Date doj = Date.valueOf(req.getParameter("doj"));
		String ct = req.getParameter("ct");
		String pass = req.getParameter("pass");
		
		TeacherDAOImp dao = new TeacherDAOImp();
		Teacher t = new Teacher();
		t.setId(id);
		t.setName(name);
		t.setEmail(email);
		t.setSubject(sub);
		t.setSal(sal);
		t.setDateOfJoining(doj);
		t.setClassTeacher(ct);
		t.setPassword(pass);
		
		PrintWriter w = resp.getWriter();
		w.write("<h1>"+"Teacher Data is Updated"+"</h1>");
		w.write(dao.updateTeacher(t));
	}
}

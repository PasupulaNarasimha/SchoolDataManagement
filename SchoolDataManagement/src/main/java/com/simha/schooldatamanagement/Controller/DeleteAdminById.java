package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.AdminDAOImp;
import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.repository.*;

@WebServlet("/deleteAdminById")
public class DeleteAdminById extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		AdminDAO dao = new AdminDAOImp();
		String a = dao.deleteAdminById(id);
		PrintWriter w = resp.getWriter();
		w.write("<h1>"+"Admin Data"+"</h1>");
		w.write(a);
	}
}

package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simha.schooldatamanagement.Imp.AdminDAOImp;
import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.repository.*;

@WebServlet("/getAllAdmin")
public class GetAllAdmin extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	AdminDAO dao = new AdminDAOImp();
	List<Admin> list = dao.getAllAdmin();
	PrintWriter w = resp.getWriter();
	w.write("<h1>"+"Total Admin Data"+"</h1>");
	for(Admin a:list)
	{
		w.write(a.toString());
		w.write("<br>");
	}
	
			
	}

}


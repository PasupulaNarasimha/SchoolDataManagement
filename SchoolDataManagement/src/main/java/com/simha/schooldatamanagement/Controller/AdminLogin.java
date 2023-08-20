package com.simha.schooldatamanagement.Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simha.schooldatamanagement.Imp.AdminDAOImp;
import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.repository.AdminDAO;
@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminDAOImp dao=new AdminDAOImp();
		String uname=req.getParameter("username");
		String password=req.getParameter("password");
		HttpSession session = req.getSession();
		Admin admin = dao.adminLogin(uname, password);
			 if(admin.getId()!=0) {
				 if(admin.getDept().equals("master")) {
					 session.setAttribute("master", admin);
					 RequestDispatcher rd = req.getRequestDispatcher("mastermenu");
					 rd.forward(req, resp);
				 }
				 else {
					 session.setAttribute("admin", admin); 
					 RequestDispatcher rd = req.getRequestDispatcher("adminmenu");
					 rd.forward(req, resp);
				 }
			 }
			 else {
				 RequestDispatcher rd = req.getRequestDispatcher("invalidadmin");
				 rd.forward(req, resp);
			 }
	}
}

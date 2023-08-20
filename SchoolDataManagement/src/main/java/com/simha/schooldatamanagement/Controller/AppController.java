package com.simha.schooldatamanagement.Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.List;

import com.simha.schooldatamanagement.Imp.StudentDAOImp;
import com.simha.schooldatamanagement.Imp.StudentDAOImp;
import com.simha.schooldatamanagement.Imp.TeacherDAOImp;
import com.simha.schooldatamanagement.dto.Student;
import com.simha.schooldatamanagement.dto.Student;
import com.simha.schooldatamanagement.dto.Teacher;
import com.simha.schooldatamanagement.repository.*;

public class AppController {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImp();
		Student student = dao.studentLogin("kiran@gmail", "kiran123");
		System.out.println(student.toString());
		System.out.println("Updated");
		
	}

}

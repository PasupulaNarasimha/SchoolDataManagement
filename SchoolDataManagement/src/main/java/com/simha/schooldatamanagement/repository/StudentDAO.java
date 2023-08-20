package com.simha.schooldatamanagement.repository;

import java.util.List;

import com.simha.schooldatamanagement.dto.Student;

public interface StudentDAO {
	Student studentLogin(String email,String password);
	String saveStudent(Student student);
	String updateStudent(Student Student);
	Student getStudentById(int id);
	List<Student> getAllStudent();
	String deleteStudentById(int id);
	
	
}

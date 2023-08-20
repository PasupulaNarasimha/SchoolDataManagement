package com.simha.schooldatamanagement.service;

import java.util.List;

import com.simha.schooldatamanagement.dto.Student;

public interface StudentService {
	Student studentLogin(String email,String password);
	String saveStudent(Student student);
	String updateStudent(Student Student);
	Student getStudentById(int id);
	List<Student> getAllStudent();
	Student deleteStudentById(int id);
	List<Student> sortedByName();
	List<Student> sortedByClass();
	List<Student> sortedByThroughtPercentage(); 
}

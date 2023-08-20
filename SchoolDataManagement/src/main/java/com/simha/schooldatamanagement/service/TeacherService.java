package com.simha.schooldatamanagement.service;

import java.util.List;

import com.simha.schooldatamanagement.dto.Teacher;

public interface TeacherService {
	Teacher TeacherLogin(String email,String password);
	String saveTeacher(Teacher Teacher);
	String updateTeacher(Teacher Teacher);
	Teacher getTeacherById(int id);
	List<Teacher> getAllTeacher();
	Teacher deleteTeacherById(int id);
}

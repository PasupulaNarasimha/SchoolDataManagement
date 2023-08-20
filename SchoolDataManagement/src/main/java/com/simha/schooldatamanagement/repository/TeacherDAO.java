package com.simha.schooldatamanagement.repository;

import java.util.List;

import com.simha.schooldatamanagement.dto.Teacher;

public interface TeacherDAO {
	Teacher TeacherLogin(String email,String password);
	String saveTeacher(Teacher Teacher);
	String updateTeacher(Teacher Teacher);
	Teacher getTeacherById(int id);
	List<Teacher> getAllTeacher();
	String deleteTeacherById(int id);
}

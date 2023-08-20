package com.simha.schooldatamanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	private Integer id;
	private String name;
	private String email;
	private String subject;
	private Double sal;
	private java.sql.Date dateOfJoining;
	private String classTeacher; 
	private String password;
}

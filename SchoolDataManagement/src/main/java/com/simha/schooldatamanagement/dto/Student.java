package com.simha.schooldatamanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Integer id;
	private String name;
	private String email;
	private Integer std;
	private String sec;
	private java.sql.Date dob;
	private String throughtPercentage;
	private String password;
	
}

package com.simha.schooldatamanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	private int id;
	private String name;
	private String email;
	private String dept;
	private String password;
}

package com.simha.schooldatamanagement.service;

import java.util.List;

import com.simha.schooldatamanagement.dto.Admin;

public interface AdminService {
	Admin adminLogin(String email,String password);
	String saveAdmin(Admin admin);
	String updateAdmin(Admin admin);
	Admin getAdminById(int id);
	List<Admin> getAllAdmin();
	Admin deleteAdminById(int id);
}

package com.simha.schooldatamanagement.repository;

import java.util.List;

import com.simha.schooldatamanagement.dto.Admin;

public interface AdminDAO {
	Admin adminLogin(String email,String password);
	String saveAdmin(Admin admin);
	String updateAdmin(Admin admin);
	Admin getAdminById(int id);
	List<Admin> getAllAdmin();
	String deleteAdminById(int id);
}

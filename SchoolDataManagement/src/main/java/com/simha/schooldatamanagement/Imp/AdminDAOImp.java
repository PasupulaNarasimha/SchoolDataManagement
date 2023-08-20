package com.simha.schooldatamanagement.Imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.repository.AdminDAO;
import com.simha.schooldatamanagement.util.ConnectionUtil;

public class AdminDAOImp implements AdminDAO {

	@Override
	public Admin adminLogin(String email, String password) {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="select * from admin where email=? and password=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet set = ps.executeQuery();
			Admin a = new Admin();
			while(set.next()) {
				a.setId(set.getInt(1));
				a.setName(set.getString(2));
				a.setEmail(set.getString(3));
				a.setDept(set.getString(4));
				a.setPassword(set.getString(5));
			}
			connection.close();
			return a;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String saveAdmin(Admin admin) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="Insert into admin values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, admin.getId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getDept());
			ps.setString(5, admin.getPassword());
			int res = ps.executeUpdate();
			connection.close();
			return res+" row of Data Inserted";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "Admin data Not saved";
	}

	@Override
	public String updateAdmin(Admin admin) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="update admin set name=?,email=?,dept=?,password=? WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(5, admin.getId());
			ps.setString(1,admin.getName());
			ps.setString(2,admin.getEmail());
			ps.setString(3, admin.getDept());
			ps.setString(4,admin.getPassword());
			int res = ps.executeUpdate();
			con.close();
			return res+"rows are updated";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "Admin data Not saved";
	}

	@Override
	public Admin getAdminById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="SELECT * FROM admin WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			Admin a=new Admin();
			while(set.next()) {
				a.setId(set.getInt(1));
				a.setName(set.getString(2));
				a.setEmail(set.getString(3));
				a.setDept(set.getString(4));
				a.setPassword(set.getString(5));
			}
			con.close();
			return a;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Admin> getAllAdmin() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="SELECT * FROM admin";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet set = ps.executeQuery();
			List<Admin>  list=null;
			if(set.isBeforeFirst()) {
				list=new ArrayList<>();
			}
			while(set.next()) {
				Admin a=new Admin();
				a.setId(set.getInt(1));
				a.setName(set.getString(2));
				a.setEmail(set.getString(3));
				a.setDept(set.getString(4));
				a.setPassword(set.getString(5));
				list.add(a);
			}
			con.close();
			return list;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteAdminById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="DELETE FROM admin WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int r = ps.executeUpdate();
			
			con.close();
			return r+" row of Data Deleted";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "Not Daleted";
	}

}

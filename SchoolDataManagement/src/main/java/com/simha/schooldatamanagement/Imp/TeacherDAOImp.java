package com.simha.schooldatamanagement.Imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.dto.Teacher;
import com.simha.schooldatamanagement.repository.TeacherDAO;

public class TeacherDAOImp implements TeacherDAO {

	@Override
	public Teacher TeacherLogin(String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="select * from teacher where email=? and password=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet set = ps.executeQuery();
			Teacher t = new Teacher();
			while(set.next()) {
				t.setId(set.getInt(1));
				t.setName(set.getString(2));
				t.setEmail(set.getString(3));
				t.setSubject(set.getString(4));
				t.setSal(set.getDouble(5));
				t.setDateOfJoining(set.getDate(6));
				t.setClassTeacher(set.getString(7));
				t.setPassword(set.getString(8));
			}
			connection.close();
			return t;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String saveTeacher(Teacher teacher) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="Insert into teacher values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, teacher.getId());
			ps.setString(2, teacher.getName());
			ps.setString(3, teacher.getEmail());
			ps.setString(4, teacher.getSubject());
			ps.setDouble(5, teacher.getSal());
			ps.setDate(6, teacher.getDateOfJoining());
			ps.setString(7, teacher.getClassTeacher());
			ps.setString(8, teacher.getPassword());
			int res = ps.executeUpdate();
			connection.close();
			return res+" row of Data Inserted";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "Teacher data Not saved";
	}

	@Override
	public String updateTeacher(Teacher teacher) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String quary="update teacher set name=?,email=?,subject=?,sal=?,dataOfJoining=?,classTeacher=?,password=? where id=?";
			PreparedStatement ps=con.prepareStatement(quary);
			ps.setInt(8, teacher.getId());
			ps.setString(1, teacher.getName());
			ps.setString(2, teacher.getEmail());
			ps.setString(3, teacher.getSubject());
			ps.setDate(4, teacher.getDateOfJoining());
			ps.setDouble(5, teacher.getSal());
			ps.setString(6, teacher.getClassTeacher());
			ps.setString(7, teacher.getPassword());
			int res=ps.executeUpdate();
			con.close();
			return res +" rowa are updated";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "Teacher data Not saved";
	}

	@Override
	public Teacher getTeacherById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="SELECT * FROM teacher WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			Teacher t=new Teacher();
			while(set.next()) {
				t.setId(set.getInt(1));
				t.setName(set.getString(2));
				t.setEmail(set.getString(3));
				t.setSubject(set.getString(4));
				t.setSal(set.getDouble(5));
				t.setDateOfJoining(set.getDate(6));
				t.setClassTeacher(set.getString(7));
				t.setPassword(set.getString(8));

			}
			con.close();
			return t;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Teacher> getAllTeacher() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="SELECT * FROM teacher";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet set = ps.executeQuery();
			List<Teacher>  list=null;
			if(set.isBeforeFirst()) {
				list=new ArrayList<>();
			}
			while(set.next()) {
				Teacher t=new Teacher();
				t.setId(set.getInt(1));
				t.setName(set.getString(2));
				t.setEmail(set.getString(3));
				t.setSubject(set.getString(4));
				t.setSal(set.getDouble(5));
				t.setDateOfJoining(set.getDate(6));
				t.setClassTeacher(set.getString(7));
				t.setPassword(set.getString(8));
				list.add(t);
			}
			con.close();
			return list;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteTeacherById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="DELETE FROM teacher WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int r = ps.executeUpdate();
			
			con.close();
			return r+" row of Data Deleted";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "Not Deleted";

	}
}

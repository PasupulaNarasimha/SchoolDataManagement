package com.simha.schooldatamanagement.Imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.simha.schooldatamanagement.dto.Admin;
import com.simha.schooldatamanagement.dto.Student;
import com.simha.schooldatamanagement.repository.StudentDAO;

public class StudentDAOImp implements StudentDAO{

	@Override
	public Student studentLogin(String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="select * from student where email=? and password=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet set = ps.executeQuery();
			Student s = new Student();
			while(set.next()) {
				s.setId(set.getInt(1));
				s.setName(set.getString(2));
				s.setEmail(set.getString(3));
				s.setStd(set.getInt(4));
				s.setSec(set.getString(5));
				s.setDob(set.getDate(6));
				s.setThroughtPercentage(set.getString(7));
				s.setPassword(set.getString(8));
			}
			connection.close();
			return s;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		System.out.println("No Object");
		return null;
	}

	@Override
	public String saveStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="Insert into student values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getEmail());
			ps.setInt(4, student.getStd());
			ps.setString(5, student.getSec());
			ps.setDate(6, student.getDob());
			ps.setString(7, student.getThroughtPercentage());
			ps.setString(8, student.getPassword());
			int res = ps.executeUpdate();
			connection.close();
			return res+" row of Data Inserted";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "student data Not saved";
	}

	@Override
	public String updateStudent(Student Student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String quary="update student set name=?,email=?,std=?,sec=?,dob=?,throughtpercentage=?,password=? where id=?";
			PreparedStatement ps=con.prepareStatement(quary);
			ps.setInt(8, Student.getId());
			ps.setString(1, Student.getName());
			ps.setString(2, Student.getEmail());
			ps.setInt(3, Student.getStd());
			ps.setString(4, Student.getSec());
			ps.setDate(5, Student.getDob());
			ps.setString(6, Student.getThroughtPercentage());
			ps.setString(7, Student.getPassword());
			int res=ps.executeUpdate();
			con.close();
			return res +" rowa are updated";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return "student data Not saved";
	}

	@Override
	public Student getStudentById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="SELECT * FROM student WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			Student s=new Student();
			while(set.next()) {
				s.setId(set.getInt(1));
				s.setName(set.getString(2));
				s.setEmail(set.getString(3));
				s.setStd(set.getInt(4));
				s.setSec(set.getString(5));
				s.setDob(set.getDate(6));
				s.setThroughtPercentage(set.getString(7));
				s.setPassword(set.getString(8));
			}
			con.close();
			return s;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="SELECT * FROM student";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet set = ps.executeQuery();
			List<Student> list=null;
			if(set.isBeforeFirst()) {
				list=new ArrayList<>();
			}
			while(set.next()) {
				Student s=new Student();
				s.setId(set.getInt(1));
				s.setName(set.getString(2));
				s.setEmail(set.getString(3));
				s.setStd(set.getInt(4));
				s.setSec(set.getString(5));
				s.setDob(set.getDate(6));
				s.setThroughtPercentage(set.getString(7));
				s.setPassword(set.getString(8));
				list.add(s);
			}
			con.close();
			return list;
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteStudentById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sdm";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="DELETE FROM student WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int r = ps.executeUpdate();
			con.close();
			return r+" row of Deleted";
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}

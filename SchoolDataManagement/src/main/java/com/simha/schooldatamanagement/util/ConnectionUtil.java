package com.simha.schooldatamanagement.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public interface ConnectionUtil {
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(AppConstants.DRIVER_NAME);
			Connection con = DriverManager.getConnection(AppConstants.URl, 
					AppConstants.USER_NAME, AppConstants.USER_PASSWORD);
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

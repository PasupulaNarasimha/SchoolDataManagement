package com.simha.schooldatamanagement.util;

public interface AppConstants {
	String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	String URl="jdbc:mysql://localhoost:3306/sdm";
	String DB_USER_NAME="root";
	String DB_USER_PASSWORD="root";
	String ADMIN_LOGIN="select * from admin where email=? and password=?";
	String USER_NAME="username";
	String USER_PASSWORD="password";
}

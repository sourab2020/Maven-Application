package org.EmployeeRepository;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
	public static Connection getConnection(){
		Connection con = null;
		
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
}

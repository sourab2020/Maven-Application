package org.EmployeeRepository;

import java.sql.Date;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


	public class SalariesDao {
		
		DatabaseConnection connection = new DatabaseConnection();
		PreparedStatement pStatement;
		ResultSet rs = null;
		Connection conn;

		
		public Salaries getEmployeeSalary(int empId) throws IOException {
			Salaries salDao = new Salaries();
			conn = connection.getConnection();
			
			try {
				pStatement = conn.prepareStatement("SELECT salary FROM salaries WHERE emp_no= ?");
				
				pStatement.setInt(1, empId);
				rs = pStatement.executeQuery();
				
				while(rs.next()){
					salDao.setSalary(rs.getDouble("salary"));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			return salDao;

		}
}

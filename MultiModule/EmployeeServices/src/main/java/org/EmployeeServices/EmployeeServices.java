package org.EmployeeServices;

import java.io.IOException;


import org.EmployeeRepository.DepartmentDao;
import org.EmployeeRepository.EmployeeDao;
import org.EmployeeRepository.SalariesDao;

public class EmployeeServices {
	
 EmployeeDao empDao = new EmployeeDao();
 DepartmentDao depDao = new DepartmentDao();
 SalariesDao salDao = new SalariesDao();
 
 public EmployeeDetails getEmployeeDetails(int empID) throws IOException{
	 
	   EmployeeDetails employeeInformation = new EmployeeDetails();
		employeeInformation.setEmployee(empDao.getEmployee(empID));
		employeeInformation.setDepartment(depDao.getDepartment(empID));
		employeeInformation.setSalaries(salDao.getEmployeeSalary(empID));
		return employeeInformation;
 }

}

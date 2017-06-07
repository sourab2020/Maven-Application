package org.MavenApplication;

import java.io.IOException;
import java.util.Scanner;

import org.EmployeeServices.EmployeeDetails;
import org.EmployeeServices.EmployeeServices;

public class EmployeeApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EmployeeServices services = new EmployeeServices();
		int empId;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		empId = scanner.nextInt();

		EmployeeDetails emp = services.getEmployeeDetails(empId);
		
		System.out.println("EmployeeID " + emp.getEmployee().getEmpNumber());
		System.out.println("FirstName: " + emp.getEmployee().getFirstName());
		System.out.println("LastName: " + emp.getEmployee().getLastTime());
		System.out.println("BirthDate: " + emp.getEmployee().getBirthDate());
		System.out.println("Gender: " + emp.getEmployee().getGender());
		System.out.println("DepartmentNumber: " + emp.getDepartment().getDeptNo());
		System.out.println("EmployeeSalary: " + emp.getSalaries().getSalary());

		scanner.close();
	}

	}



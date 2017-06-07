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
		
		System.out.println("Employee ID: " + emp.getEmployee().getEmpNumber());
		System.out.println("First Name: " + emp.getEmployee().getFirstName());
		System.out.println("Last Name: " + emp.getEmployee().getLastTime());
		System.out.println("Birth Date: " + emp.getEmployee().getBirthDate());
		System.out.println("Gender: " + emp.getEmployee().getGender());
		System.out.println("Department Number: " + emp.getDepartment().getDeptNo());
		System.out.println("Salary: " + emp.getSalaries().getSalary());

		scanner.close();
	}

	}



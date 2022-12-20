package com.blz.empservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService() {
		employeePayrollList = new ArrayList<EmployeePayrollData>();
	}
	
	//create parameterized constructor
	//all data stored about employee
	public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList) {}
	
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		Scanner sc = new Scanner(System.in);
		//Scanner consoleInputReader;
		employeePayrollService.readEmployeePayrollData(sc);
		employeePayrollService.writeEmployeePayrollData();
	}
	
	//to take data from console
	private void readEmployeePayrollData(Scanner consoleInputeReader) {
		System.out.println("Enter Employee ID");
		int id = consoleInputeReader .nextInt();
		System.out.println("enter Employee Name: ");
		String name = consoleInputeReader .next();
		System.out.println("enter Employee Salary: ");
		double salary = consoleInputeReader .nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
		}
	
	private void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll Roaster to Cosole\n" +  employeePayrollList);
	}
}



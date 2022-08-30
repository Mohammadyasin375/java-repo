package com.main;

import java.util.Scanner;

import com.beans.Employee;
import com.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Employee Details");
		System.out.println("Employee Name: ");
		String name = sc.next();
		System.out.println("Employee City: ");
		String city = sc.next();
		System.out.println("Employee salary: ");
		double salary = sc.nextDouble();
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setCity(city);
		employee.setSalary(salary);
		
		EmployeeService employeeService = new EmployeeService();
		employeeService.insert(employee);
		System.out.println("Employee Record Inserted.. ");
	}
}

package com.service;

import com.beans.Employee;
import com.db.EmployeeDB;

public class EmployeeService {

	public void insert(Employee employee) {
		EmployeeDB employeeDB = new EmployeeDB();
		employeeDB.insert(employee);
		
	}

}

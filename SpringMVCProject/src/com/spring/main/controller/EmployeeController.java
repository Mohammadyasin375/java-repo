package com.spring.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.main.model.Employee;
import com.spring.main.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService; 
	
	@Autowired
	private Employee employee;
	
	@RequestMapping("/all-employees")
	public String showAllEmployees(Model model) {
		//reach out to service class and fetch list having all employee objects
		List<Employee> list = employeeService.fetchAllEmployees(); 
		model.addAttribute("list", list);
		return "all-employee";
	}
	
	public void showEmployeeById() {
		//reach out to service and fetch employee object based on ID. 
		 
	}
	
	public void deleteEmployeeById() {
		
	}
	
	@RequestMapping("/insert-employee")
	public void insertEmployee(@RequestParam("ename") String name, 
							   @RequestParam("ecity") String city, 
							   @RequestParam("esalary") double salary) {
		employee.setName(name);
		employee.setSalary(salary);
		employee.setCity(city);
		
		System.out.println(employee);
	}
}

package com.spring.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MainController {
	 
	@RequestMapping("/")
	public String showIndex() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping("/dashboard")
	public String showDashboard() {
		//go to DB fetch the data and give to JSP  
		return "dashboard";
	}
}

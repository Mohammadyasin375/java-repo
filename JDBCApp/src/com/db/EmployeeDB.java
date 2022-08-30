package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.Employee;

public class EmployeeDB {
	Connection con;
	public void dbConnect() {
		//Step 1: Load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded..");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Step 2: Establish the connection
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycompanydb_55555"
					, "root", "");
			System.out.println("Connection Established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void insert(Employee employee) {
		dbConnect();
		String sql="insert into employee(name,salary,city) values (?,?,?)";
		try {
			//prepare the query statement
			PreparedStatement pstmt = con.prepareStatement(sql);
			//assigned values to ? 
			pstmt.setString(1, employee.getName());
			pstmt.setDouble(2, employee.getSalary());
			pstmt.setString(3, employee.getCity());
			
			//execute the query
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbClose();
	}

	public void dbClose() {
		try {
			con.close();
			System.out.println("conn closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
/*
executeQuery() : select 
executeUpdate() : update, delete and insert

*/
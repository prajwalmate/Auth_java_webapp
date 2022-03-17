package com.report.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.employee.Employee;
import com.student.Student;

public class ReportDao {

	public ArrayList<Employee> check(String empid1)
	{
		String empid = null;
	    String fname = null;
	    String lname = null;
	    String dob = null;
	    String contact = null;
	    String role = null;
	    String salary = null;
	    String bonus = null;
		ArrayList<Employee> Employees = new ArrayList<Employee>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","0");
			      
			PreparedStatement ps=con.prepareStatement("select * from prajwal_111915090_detail where empid=?");  
			ps.setString(1,empid1);  
			ResultSet rs=ps.executeQuery();  
			
			while(rs.next())
			{
				empid = rs.getString(1);
				fname = rs.getString(3);
				lname = rs.getString(4);
				dob = rs.getString(5);
				contact = rs.getString(6);
			}
			
			ps=con.prepareStatement("select * from prajwal_111915090_salary where empid=?");
			ps.setString(1,empid1);  
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				role = rs.getString(2);
				salary = rs.getString(3);
				bonus = rs.getString(4);
			}
			
			Employee emp = new Employee(empid, fname, lname, dob, contact, role, salary, bonus);
			Employees.add(emp);
			
		} catch (Exception e) { 
			e.printStackTrace();
			
		}
		return Employees;
	}
	
}

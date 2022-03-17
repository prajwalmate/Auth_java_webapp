package com.report.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.student.Student;

public class ReportDao {

	public ArrayList<Student> check(String lname)
	{
		ArrayList<Student> Students = new ArrayList<Student>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","0");
			      
			PreparedStatement ps=con.prepareStatement("select * from Authusers where lname=?");  
			ps.setString(1,lname);  
			ResultSet rs=ps.executeQuery();  
			
			while(rs.next())
			{
				Students.add(new Student(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			}
		} catch (Exception e) { 
			e.printStackTrace();
			
		}
		return Students;
	}
	
}

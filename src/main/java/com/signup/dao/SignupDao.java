package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {

	public void insert(String name,String pass, String fname, String lname, String dob, String email){  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","0");
			   
			PreparedStatement ps=con.prepareStatement("insert into AuthUsers values ('" + name + "','" + pass + "','" + fname + "','" + lname + "','" + dob + "','" + email + "')");   
			      
			ResultSet rs=ps.executeQuery();  

		          
		}
		catch(Exception e){
			System.out.println(e);
		}  
	}  
	
}

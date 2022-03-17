package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {

	public void insert(String empid,String pass, String fname, String lname, String dob, String contact){  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","0");
			   
			PreparedStatement ps=con.prepareStatement("insert into prajwal_111915090_detail values ('" + empid + "','" + pass + "','" + fname + "','" + lname + "','" + dob + "','" + contact + "')");   
			      
			ResultSet rs=ps.executeQuery();  

		}
		catch(Exception e){
			System.out.println(e);
		}  
	}  
	
}

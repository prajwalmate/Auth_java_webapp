package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public boolean validate(String empid,String pass){  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","0");
			   
			PreparedStatement ps=con.prepareStatement("select * from prajwal_111915090_detail where empid=? and password=?");  
			ps.setString(1,empid);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			if(rs.next()) {
				return true;
			}
		          
		}
		catch(Exception e){
			System.out.println(e);
		}  
		return false;  
	} 
	
}

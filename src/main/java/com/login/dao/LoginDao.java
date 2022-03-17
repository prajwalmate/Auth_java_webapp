package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","0");
			   
			PreparedStatement ps=con.prepareStatement("select * from AuthUsers where name=? and pass=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			if(rs.next()) {
				return true;
			}
		          
		}
		catch(Exception e){
			System.out.println(e);
		}  
		return status;  
	} 
	
}

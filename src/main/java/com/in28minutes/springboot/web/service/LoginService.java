package com.in28minutes.springboot.web.service;
import java.sql.*; 
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean validateUser(String name,String pass)
	{

		boolean status=false;  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		
		  Connection con =
		  DriverManager.getConnection("jdbc:mysql://localhost:3306/demoapp?" +
		  "user=root&password=root@123");
		 
		 
		
		/*
		 * Connection con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/demoapp?" +
		 * "user=root&password=root@123");
		 */
		 
		/*
		 * Connection con=DriverManager.getConnection(
		 * "jdbc:mysql://mysqldb:33060/demoapp","dbusr","root@123");
		 */ 
		System.out.println("Database connection successful");
		PreparedStatement ps=con.prepareStatement(  
		"select * from login where username=? and password=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);
		System.out.println("Database connection failed");}  
		return status;  
			
	}

}

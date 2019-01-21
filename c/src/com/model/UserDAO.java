package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {
  public static boolean validate(String user, String pass){
	  try{
		 Connection c=ConnectionProvider.getConnection(); 
		 Statement s=c.createStatement();
		 ResultSet rs=s.executeQuery("select * from employees where first_name='"+user+"'");
		 if(rs.next())
			 if(pass.equals("123456"))
		 		return true;
		 return false;
		 
	  }
	  catch(Exception e){
		  e.printStackTrace();
		  return false;
		  
	  }
  }
  
  public static void addToken(String token,String user){
	  try{
		  Connection c=ConnectionProvider.getConnection(); 
			
			PreparedStatement ps=c.prepareStatement("insert into tokenstore values(?,?)");
			ps.setString(1, token);
			ps.setString(2, user);
			ps.executeUpdate();
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
  }
  
  public static boolean deleteToken(String token){
	  
	  try{
		  Connection c=ConnectionProvider.getConnection(); 
			
			PreparedStatement ps=c.prepareStatement("delete from tokenstore where token=?");
			ps.setString(1, token);
			ps.executeUpdate();
			return true;
	  }
	  catch(Exception e){
		  e.printStackTrace();
		  return false;
	  }
  }
}

package com.model.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareDemo {
     
   public static void main(String n[]){
	   
	   Connection c=ConnectionProvider.getConnection();
	   Scanner s=new Scanner(System.in);
	   while(true){
		   System.out.println("Enter sno:");
		   int sno=Integer.parseInt(s.next());
		   System.out.println("Enter name:");
		   String name=s.next();
		   if(sno==-1)
			   break;
	   try{
		 PreparedStatement p=c.prepareStatement("insert into firsttab values(?,?)");
		 p.setInt(1, sno);
		 p.setString(2, name);
		 p.executeUpdate();
		 System.out.println("Row Inserted");
	   }
	   catch(SQLException e)
	   {
		   e.printStackTrace();
	   }
	   
   }
}
}

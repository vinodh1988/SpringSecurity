package com.model.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Connection c= ConnectionProvider.getConnection();
       try{
    	 Statement s= c.createStatement();   
    	 ResultSet rs=s.executeQuery("select * from firsttab");
         ResultSetMetaData md=	 rs.getMetaData();
         System.out.println(md.getColumnName(1)+"              "+md.getColumnName(2));
         System.out.println("----------------------------------------------------");
    	 while(rs.next()){
    		 System.out.printf("\n%10d %30s ",rs.getInt("sno"),rs.getString("name"));
    		 
    	 }
        
       }
       catch(SQLException e){
    	   e.printStackTrace();
       }
	}

}

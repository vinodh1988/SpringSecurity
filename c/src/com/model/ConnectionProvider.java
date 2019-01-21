package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionProvider {

	private static Connection connection;
	
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establishing Connection
			connection=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return connection;
	}
}

package com.model.jobs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.demo.ConnectionProvider;

public class JobsDAO {

	public static boolean insert(Jobs j){
		try{
			Connection c=ConnectionProvider.getConnection();
			PreparedStatement p=c.prepareStatement
					("insert into jobs values(?,?,?,?)");
			p.setString(1, j.getJob_id());
			p.setString(2, j.getJob_title());
			p.setInt(3, j.getMin_salary());
			p.setInt(4, j.getMax_salary());
			p.executeUpdate();
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public static List<Jobs> getJobs(){
		try{
			List<Jobs> l=new ArrayList<Jobs>();
			Connection c=ConnectionProvider.getConnection();
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from jobs");
			while(rs.next()){
				Jobs j=new Jobs();
				j.setJob_id(rs.getString(1));
				j.setJob_title(rs.getString(2));
				j.setMin_salary(rs.getInt(3));
				j.setMax_salary(rs.getInt(4));
				l.add(j);
			}
			return l;
		}
		catch(SQLException e){
			e.printStackTrace();
			return null;
		}
		
	}
}

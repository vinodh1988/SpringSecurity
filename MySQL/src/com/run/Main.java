package com.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) {
	try{
		String images[]={
				"hybrid.jpg",
				"node.jpg",
				"web.jpg",
				"angular.jpg",
				"tuning.jpg",
				"sqltuning.jpg",
				"mysql.jpg",
				"jsp.jpg",
				"sysadmin.jpg",
				"12cnew.jpg",
				"12cadmin.jpg",
				"12cback.jpg",
				"12cmulti.jpg",
				"12cdata.jpg",
				"12ctuning.jpg",
				"weblogic.jpg",
				"weblogic1.jpg",
				"sql.jpg",
				"plsql.jpg",
				"rac.jpg",
				"java.jpg",
				"gg.jpg",
				"java.jpg",
				"js.jpg",
				"sa.jpg"
		};
		String description[]={
				"Course about hybrid mobile applications.Ionic is the technology used",
				"Course about client side coding. HTML 5, CSS and JS covered",
				"Node Js platform expored completly in this course",
				"UI Development using Angular .A Framework by Googe",
				"Performance tuning the oracle 11g Database",
				"SQL statement level tuning.",
				"MySQL database administration course in and out",
				"Course on JSP and Servlet administration. Enterprise development Explored",
				"Solaris OS adminstration Course",
				"12C oracle Database new Features Explored in this course",
				"12C Database Administration explored in this course",
				"12C Database backup and recovery concepts explained",
				"12c Multi Tenant Architecuture Explained in this course",
				"12c Dataguard Administration...This is about datagaurd Administration...!!!",
				"12c performanc Tuning course end to end",
				"Weblogic Administration course .Fundamental concepts",
				"Weblogic Administration course .Advanced concepts",
				"SQL Development course .Taught with oracle database",
				"PLSQL Development course .Taught with oracle database",
				"RAC Administration Course. Checking Real Application cluster conceptes",
				"Core JAva Concepts explained in this course",
				"Golden gate Configuration and Adminstration course",
				"Java Advanced Concepts and Core concepts",
				"Javascript and latest html standards explained in this course",
				"Oracle linux administration course....."
				
				
		};
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/isql","root","password");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from moduledetails");
		PreparedStatement p=c.prepareStatement("update moduledetails set description=?,filename=? where modulecode=?");
	    int i=0;
		while(rs.next()){
	    	p.setString(1, description[i]);
	    	p.setString(2, images[i]);
	    	p.setString(3, rs.getString(1));
	    	p.executeUpdate();
	    	i++;
	    }
	}
	catch(Exception e){
		e.printStackTrace();
	}
  }
}

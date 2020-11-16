package com.tyagi.connection;

import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {
 private static String driverName="com.mysql.jdbc.Driver";
 private static String dbUrl="jdbc:mysql://localhost:3306/aakashtwo";
 private static String userName="root";
 private static String dbPass="@aakash";
 
 public static Connection getCon()throws Exception{
	 Class.forName(driverName);
	 Connection con = DriverManager.getConnection(dbUrl,userName,dbPass);
	 if(con==null){
		 throw new Exception("Connection is not created");
	 }
	 System.out.println("Created");
	 return con;
 }
}



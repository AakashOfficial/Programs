package connection;

import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {
 private static String driverName="com.mysql.jdbc.Driver";
 private static String dbUrl="jdbc:mysql://localhost:3306/aakash";
 private static String userName="root";
 private static String dbPass="@aakash";
 
 public static Connection getCon()throws Exception{
	 Class.forName(driverName);
	 Connection con = DriverManager.getConnection(dbUrl,userName,dbPass);
	 return con;
 }
}


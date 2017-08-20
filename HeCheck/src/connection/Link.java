package connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class Link {


 private static String driverName="";
 private static String dbUrl="jdbc:h2:~/test";
 private static String userName="sa";
 private static String dbPass="@aakash";
 
 public static Connection getCon()throws Exception{
	 Class.forName(driverName);
	 Connection con = DriverManager.getConnection(dbUrl,userName,dbPass);
	 return con;
 }
}
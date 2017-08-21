import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 import java.io.Serializable;
 
public class Requirements implements Serializable{

 private static String driverName="com.mysql.jdbc.Driver";
 private static String dbUrl="jdbc:mysql://localhost:3306/aakashtwo";
 private static String userName="root";
 private static String dbPass="@aakash";
 
   
 
 public static Connection getCon()throws Exception{
	 Class.forName(driverName);
	 Connection con = DriverManager.getConnection(dbUrl,userName,dbPass);
	 return con;
 }
     

 
 public boolean addData(Requirements m ){
	   String insertQuery="insert into mydata values("+m.getRollno()+",'"+m.getFirstname()+"','"+m.getLastname()+"','"+m.getAddress()+"','"+m.getEmail()+"')";
	   try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(insertQuery);
		   if(i==1){
		   System.out.println("Data is inserted with price"+m.getRollno());
		   return true;
		   }
	   }catch(Exception e){e.printStackTrace();}
	   return false;
   }
   
   
}
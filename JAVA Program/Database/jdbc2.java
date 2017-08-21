import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class DatabaseCheck
 {
  public static void main(String []args)throws Exception 
   {
    Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","@aakash");
	
	Statement stmt=con.createStatement();
	stmt.executeUpdate("create table computer(model varchar(25),price int(5),company varchar(10))");
	System.out.println("Updated");
	con.close();
   }
 }
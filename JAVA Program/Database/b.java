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
	
	Resultset rs=stmt.executeUpdate("select * from computer");
	System.out.println();
	
	con.close();
   }
 }
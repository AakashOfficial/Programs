import java.sql.*;

public class LoginDao {

public static boolean validate(String name,String pass){
boolean status=false;
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","@aakash");
	
	PreparedStatement ps=con.prepareStatement("select * from registeruser where Username=? and Password=?");
	ps.setString(1,name);
	ps.setString(2,pass);
	
	ResultSet rs=ps.executeQuery();
	status=rs.next();
	
	
}catch(Exception e){System.out.println(e);}
return status;
}
}

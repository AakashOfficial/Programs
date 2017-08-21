import java.sql.*;  
class MysqlCon{  
public static void main(String args[])throws Exception{  
 
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:33060/aakash","root","@aakash");    
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("create table computer(model varchar(25),price int(5),company varchar(10))");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}  
 
}  
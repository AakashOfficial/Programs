import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
 private static String driverName="com.mysql.jdbc.Driver";
 private static String dbUrl="jdbc:mysql://localhost:3306/aakash";
 private static String userName="root";
 private static String dbPass="@aakash";
 
 public static Connection getCon()throws Exception{
	 Class.forName(driverName);
	 Connection con = DriverManager.getConnection(dbUrl,userName,dbPass);
	 return con;
 }
 
  public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
	  resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
	  String fn=req.getParameter("firstname");
	  String ln=req.getParameter("lastname");
	  String ad=req.getParameter("address");
	  String e=req.getParameter("email");
	  
	  
	 // String c=req.getParameter("course");
	  
	  
	 /* out.println("<div style='background-color:red color:blue'><center><h1>Tyagi LTD<h1></center>");
	  out.println("Your details:<br/>");
	  out.println("Full Name : "+fn+ ""+ln+"<br/>");
	  out.println("address : "+ad+"<br/>");
	  out.println("email address : "+e+"<br/>");
	  out.println("<div style='background-color:red color:blue'><center><h4>copyright<h4></center>");*/
	  
	  out.close();
  }
}

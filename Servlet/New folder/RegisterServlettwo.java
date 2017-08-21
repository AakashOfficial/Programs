package com.tyagi.Servlet;
/*8036 8037 8038*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("ResgiserServlet")
public class RegisterServlet extends HttpServlet{
	
	public void doGET(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		  
	  }

}


 public boolean addComputer(Computer c){
	   String insertQuery="insert into computer values("+c.getPrice()+",'"+c.getSName()+"','"+c.getCName()+"',"+c.getquantity()+")";
	   try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(insertQuery);
		   if(i==1){
		   System.out.println("Computer is inserted with price"+c.getPrice());
		   return true;
		   }
	   }catch(Exception e){e.printStackTrace();}
	   return false;
   }
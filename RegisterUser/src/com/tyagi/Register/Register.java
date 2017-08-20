package com.tyagi.Register;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

    @WebServlet("/register")
	public class Register extends HttpServlet {
			public void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				String n=request.getParameter("userName");
				//String p=request.getParameter("userPass");
				//String e=request.getParameter("userEmail");
				//String c=request.getParameter("userCountry");
				
				/*try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","@aakash"); 
					   
						   Statement stmt=con.createStatement();
						   int i=stmt.executeUpdate("insert into registeruser values('"+n+"','"+p+"','"+e+"','"+c+"')");
						   if(i==1){
						   out.println("You are successfully registered..."+n);
						   }else {out.println("User Not Registered");}
					   }catch(Exception ex){ex.printStackTrace();}*/
				
				out.println("welcome user"+n);
				out.println("You are successfully registered");
							
				out.close();
			
		}

	}


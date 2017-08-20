package com.tyagi.Servlet;

import com.tyagi.Model.User;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;

@WebServlet("/loginServlet")
public class Login extends HttpServlet {
	   
	
				public void doGet(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {

					response.setContentType("text/html");
					PrintWriter out = response.getWriter();
					
					String n=request.getParameter("userName");
					String p=request.getParameter("userPass");
									
					try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","@aakash"); 
						   
					 List<User> list=new ArrayList<>();
							   Statement stmt=con.createStatement();
							   ResultSet resultset=stmt.executeQuery("select * from registeruser where userName=('"+n+"') and userPass=('"+p+"')");
							   
							   while(resultset.next()){
								   User c=new User();
								   c.setUserID(resultset.getString(1));;
								   c.setPassword(resultset.getString(2));
								   c.setEmail(resultset.getString(3));
								   c.setCountry(resultset.getString(4));
								   list.add(c);
							   }
							 
							   out.println("Welcome,You are successfully login");
							   out.println(list);
							  							   
					}catch(Exception ex){ex.printStackTrace();}
					
						
					}				
				
				}						  
						   
						  	  
					 

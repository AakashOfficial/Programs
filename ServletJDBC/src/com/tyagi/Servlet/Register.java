package com.tyagi.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
	public class Register extends HttpServlet {
		
		  
	 public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
		  resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		  String un=req.getParameter("Username");
		//  String p=req.getParameter("password");
		 
		  
			
		
			
			out.println("welcome"+un);
			
			out.println("You are successfully registered");
						    

		 /* out.println("Welcome user \t"+un);
		  
		  out.println("Your password is \t"+p);
		  */
		  out.close();
	  }
	}

	



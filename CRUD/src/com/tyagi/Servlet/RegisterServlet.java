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
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		  resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		 
		  String n=req.getParameter("Name");
		  out.println("Welcome"+n);
		  
		  out.close();
	  }

}


package com.tyagi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Scanner;
//import java.util.Iterator;
//import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyagi.dao.MyDataDAO;
import com.tyagi.dao.MyDataDAOImpl;
import com.tyagi.model.MyData;

@WebServlet("/ResgisetServlet")
public class RegisterServlet  extends HttpServlet {
	
 MyData m = new MyData();
 
  public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
	  resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
	  m.setRollno(Integer.parseInt(req.getParameter("rollno")));
	  m.setFirstname(req.getParameter("firstname"));
	  m.setLastname(req.getParameter("lastname"));
	  m.setAddress(req.getParameter("address"));
	  m.setEmail(req.getParameter("email"));
	  
	  MyDataDAO myDAO=new MyDataDAOImpl();
	  boolean result=myDAO.addData(m);
		
	  out.println("Data is Successfully inserted"+result);
	  
	  out.close();
  }
}

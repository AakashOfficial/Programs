package com.tyagi.ExamplePackage;

import java.sql.*;
import java.util.*;


public class ConnectionManager {

   static Connection con;
   static String url;
         
   public static Connection getConnection()
   {
     
      try
      {
         String url = "jdbc:mysql://localhost:3306/aakash"; 
        
         Class.forName("com.mysql.jdbc.Driver");
         
         try
         {            	
            con = DriverManager.getConnection(url,"root","@aakash"); 
             							              
         }
         
         catch (SQLException ex)
         {
            ex.printStackTrace();
         }
      }

      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      }

   return con;
}
}
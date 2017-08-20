package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.MyConnection;
import model.Computer;

public class ComputerDAOImpl implements ComputerDAO  {
   private static Connection con;
   static{
	   try{
		   con=MyConnection.getCon();
	   }catch(Exception e){e.printStackTrace();}
   }
   
   @Override
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
   
   @Override
   public List<Computer> getAllComputer(){
	   List<Computer> list=new ArrayList<>();
	   String getQuery="Select * from Computer";
	   try{
		   PreparedStatement stmt=con.prepareStatement(getQuery);
		   ResultSet resultset=stmt.executeQuery();
		   while(resultset.next()){
			   Computer c=new Computer();
			   c.setPrice(resultset.getInt(1));;
			   c.setSName(resultset.getString(2));
			   c.setCName(resultset.getString(3));
			   c.setquantity(resultset.getInt(4));
			   list.add(c);
		   }
	   }catch(Exception e){e.printStackTrace();}
	   System.out.println(list);
		   return list;
   }
   
  /* @Override
   public boolean deleteComputer(int price){
	   Computer com=findComputer(price);
	   if(com==null)
		   return false;
	   String deleteQuery="delete from Computer where price="+price;
	   try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(deleteQuery);
		  if(i==1){
			  System.out.println("Computer is deleted with price"+com.getPrice());
		  } 
	   }catch(Exception e){e.printStackTrace();}
	   return true;
   }
   
   @Override
   public boolean updateComputer(int price,String cName){
	   Computer com=findComputer(price);
	   if(com==null)
		   return false;
	   String updateQuery="update computer set sName="+com.getSName()+"where price="+com.getPrice()+"and cName="+com.getCName();
	   try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(updateQuery);
		  if(i==1){
			  System.out.println("Computer is deleted with price"+com.getPrice()+"and cName"+com.getCName());
		  } 
	   }catch(Exception e){e.printStackTrace();}
	   return true; 
   }
   
   @Override
   public Computer findComputer(int price){
	  String checkQuery="select * from computer where price="+price; 
	  try{
		  Statement stmt=con.createStatement();
		  ResultSet rs=stmt.executeQuery(checkQuery);
		   while(rs.next()){
			   return new Computer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		   }
	  }catch(Exception e){e.printStackTrace();}
	  return null;
   }
   
   @Override
   public void deleteAllComputer(){
	   String deleteQuery="delete from computer";
	   try{
		   Statement stmt=con.createStatement();
			  ResultSet rs=stmt.executeQuery(deleteQuery);
	   }catch(Exception e){e.printStackTrace();}
   }*/
}
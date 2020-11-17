package com.tyagi.dao;
import com.tyagi.model.MyData;
import com.tyagi.connection.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MyDataDAOImpl implements MyDataDAO {
	
	private static Connection con;
	static{
		try{
			con=MyConnection.getCon();
		}catch(Exception e){e.printStackTrace();}
	}
   
 	@Override
        public boolean addData(MyData m){
		String insertQuery="insert into computer values("+m.getRollno()+",'"+m.getFirstname()+"','"+m.getLastname()+"','"+m.getAddress()+"','"+m.getEmail()+"')";
	   	try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(insertQuery);
		   if(i==1){
		   	System.out.println("Computer is inserted with price"+m.getRollno());
		   	return true;
		   }
	   	}catch(Exception e){e.printStackTrace();}
	   	return false;
   	}
/*   
  @Override
   public List<MyData> getAllData(){
	   List<MyData> list=new ArrayList<>();
	   String getQuery="Select * from mydata";
	   try{
		   PreparedStatement stmt=con.prepareStatement(getQuery);
		   ResultSet resultset=stmt.executeQuery();
		   while(resultset.next()){
			   MyData m=new MyData();
			   m.setRollno(resultset.getInt(1));;
			   m.setFirstname(resultset.getString(2));
			   m.setLastname(resultset.getString(3));
			   m.setAddress(resultset.getString(4));
			   m.setEmail(resultset.getString(5));
			   list.add(m);
		   }
	   }catch(Exception e){e.printStackTrace();}
	   System.out.println(list);
		   return list;
   }
   
   @Override
   public boolean deleteData(int rollno){
	   String deleteQuery="delete from mydata where Rollno="+rollno;
	   try{
	       Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(deleteQuery);
		   if(i==1){
			   System.out.println("Data is Deleted Whose Rollno Is"+rollno);
		  }
	  }catch(Exception e){e.printStackTrace();}
	   return false;
   }
   
   @Override
   public boolean deleteAllData(){
   String deleteQuery="delete from mydata";
   try{
	   Statement stmt=con.createStatement();
		  int i=stmt.executeUpdate(deleteQuery);
		  if(i==1){
			  System.out.println("ALl the data is deleted");
			  return true;
		  }
          }catch(Exception e){e.printStackTrace();}
   return false;
   }*/
}

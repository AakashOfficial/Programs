import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



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
   
  /* @Override
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
   
   @Override
   public boolean deleteComputer(int price){
	   String deleteQuery="delete from computer where price="+price;
	   try{
	       Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(deleteQuery);
		   if(i==1){
			   System.out.println("Computer is Deleted Whose Price Is"+price);
		  }
	  }catch(Exception e){e.printStackTrace();}
	   return false;
   }
   
   @Override
   public boolean deleteAllComputer(){
   String deleteQuery="delete from computer";
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
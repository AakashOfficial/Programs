/* for Showing data

package test;

import java.util.Iterator;
import java.util.List;

import dao.ComputerDAO;
import dao.ComputerDAOImpl;
import model.Computer;

public class Test {
	static ComputerDAO comDAO;	
	static{
		comDAO=new ComputerDAOImpl();
	}
	
	public static void ShowAll(){
		try{
			List<Computer> List=comDAO.getAllComputer();
		    Iterator<Computer> itr=List.iterator();
		    System.out.println("Retrieving computer from Database...");
			   while(itr.hasNext()){
				   Computer c=(Computer)itr.next();
				   System.out.println(c);
			   }
		}catch(Exception e){e.printStackTrace();}
   }
	public static void main(String args[]){
		   ShowAll();
	   }
}*/

package test;

import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

import dao.ComputerDAO;
import dao.ComputerDAOImpl;
import model.Computer;

public class Test{
	
	//static block for retrieving data 
	static ComputerDAO comDAO;	
	static{
		comDAO=new ComputerDAOImpl();
	}
	static Computer c;
	static Scanner s;
	static int a;
	
	//for adding data to database
	public static void AddComputer(){
		c=new Computer();
		s =new Scanner(System.in);
		System.out.println("Enter Computer Price");
		c.setPrice(s.nextInt());
		System.out.println("Enter Name Of Series Of Computer");
		c.setCName(s.nextLine());
		System.out.println("Enter Name Of Company Of Computer");
		c.setCName(s.nextLine());
		System.out.println("Enter Number Of Computer");
		c.setPrice(s.nextInt());
		
		ComputerDAO comDAO=new ComputerDAOImpl();
		boolean result=comDAO.addComputer(c);
		System.out.println("Computer Inserted Successfully"+result);
	}
	
	//for retrieving data from database
	public static void ShowAll(){
		try{
			List<Computer> List=comDAO.getAllComputer();
		    Iterator<Computer> itr=List.iterator();
		    System.out.println("Retrieving computer from Database...");
			   while(itr.hasNext()){
				   Computer c=(Computer)itr.next();
				   System.out.println(c);
			   }
		}catch(Exception e){e.printStackTrace();}
   }
	
	//for delete a row in table in database
	public static void Delete(int a){
		System.out.println("Enter Price of Computer Which you want to be Deleted");
		a=s.nextInt();
		comDAO.deleteComputer(a);
	}
	
	//for delete all the data from database
	public static void DeleteAll(){
		comDAO.deleteAllComputer();
	}
	public static void main(String args[]){
		AddComputer();
		//ShowAll();
		//Delete(a);
		//DeleteAll();
	}
}

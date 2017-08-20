/*package test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

import dao.ComputerDAO;
import dao.ComputerDAOImpl;
import model.Computer;

public class Test {
	static ComputerDAO comDAO;	
		
		/*Scanner sc=new Scanner(System.in);
        System.out.println("Enter computer price");
        c.setPrice(sc.nextInt());
        System.out.println("Enter series name of computer");
        c.setSName(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter Company name of computer");
        c.setCName(sc.nextLine());
        System.out.println("Enter computer Quantity");
        c.setquantity(sc.nextInt());
        
        ComputerDAO comDAO=new ComputerDAOImpl();
        boolean result=comDAO.addComputer(c);
        System.out.print("Computer inserted Successfully in database :"+result);
        sc.close();*/
	
  /* public static void getAllComputer(){
	   List<Computer> List=comDAO.getAllComputer();
	   Iterator<Computer> itr=List.iterator();
	   System.out.println("Retrieving computer from Database...");
	   while(itr.hasNext()){
		   Computer c=(Computer)itr.next();
		   System.out.println(c);
	   }
   }
   public static void main(String args[])throws Exception{
	   getAllComputer();
   }
}*/

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
	
	public static void main(String args[])throws Exception{
	   List<Computer> List=comDAO.getAllComputer();
	   Iterator<Computer> itr=List.iterator();
	   System.out.println("Retrieving computer from Database...");
	   while(itr.hasNext()){
		   Computer c=(Computer)itr.next();
		   System.out.println(c);
	   }
   }
}
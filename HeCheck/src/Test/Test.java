package Test;

import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

import source.Impleclass;
import source.Imple;
import getersetter.Data;

public class Test{
	
	//static block for retrieving data 
	static Imple comDAO;	
	static{
		comDAO=new Impleclass();
	}
	static Data c;
	static Scanner s;
	static int a;
	
	//for adding data to database
	public static void AddComputer(){
		c=new Data();
		s =new Scanner(System.in);
		System.out.println("Enter Computer Price");
		c.setPrice(s.nextInt());
		System.out.println("Enter Name Of Series Of Computer");
		c.setCName(s.nextLine());
		System.out.println("Enter Name Of Company Of Computer");
		c.setCName(s.nextLine());
		System.out.println("Enter Number Of Computer");
		c.setPrice(s.nextInt());
		
		Imple comDAO=new Impleclass();
		boolean result=comDAO.addComputer(c);
		System.out.println("Computer Inserted Successfully"+result);
	}
	
	//for retrieving data from database
	public static void ShowAll(){
		try{
			List<Data> List=comDAO.getAllComputer();
		    Iterator<Data> itr=List.iterator();
		    System.out.println("Retrieving computer from Database...");
			   while(itr.hasNext()){
				   Data c=(Data)itr.next();
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

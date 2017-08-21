package c09;
public class ExceptionMethods 
 {
  public static void main(String[] args)
   {
    try
	 {
	  throw new Exception("Here's My Exception");
	 }
	catch(Exception e)
	 {
	  System.out.println("Caught Exception");
	  System.out.println("e.getMessage():" + e.getMessage());
	  System.out.println("e.toString():" + e.toString());
	  System.out.println("e.printStackTrace():");
	  e.printStackTrace();
	 }
   }
 }
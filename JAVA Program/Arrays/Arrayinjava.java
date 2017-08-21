//How to use one dimensional array in java
import java.util.*;
import java.lang.*;
Class Arrayinja {
 public static void main(String arr[]) 
  {
    Scanner s=new Scanner(System.in);
    int size=Integer.parseInt(arr[0]);          
    int args[]=new int[size];
                                       //int args[]=new int(Integer.parseInt(arr[0]));
    for(int i=0;i<size;i++) 
     {
      System.out.println("Enter element :"+i);
      arr[i]=s.nextInt();
     }
    System.out.println("Accessing array");
     for(int i=0;i<size;i++)
      {
       System.out.println("arr["+i+"]:"+args[i]);
      }
   }    
 }

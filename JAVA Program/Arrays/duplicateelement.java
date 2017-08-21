//find duplicate element in array in java
import java.util.*;
class duplicateelement {
 public static void main(String args[]) {
    int i,j;
    Scanner s=new Scanner(System.in);
    int size=Integer.parseInt(args[0]);
    int arr[]=new int[size];
    for(i=0;i<size;i++) 
     {
      System.out.println("Enter element :"+i);
      arr[i]=s.nextInt();
     }
    System.out.println("Accessing array");
     for(i=0;i<size;i++)
      {
       System.out.println("arr["+i+"]:"+arr[i]);
       }
    for(i=0;i<arr.length-1;i++)
      {
         for(j=i+1;j<arr.length;j++)
           {
             if(arr[i]==(arr[j]) && i!=j )
              {
              System.out.println(arr[j]+"is duplicate");
              }
           }
     }
   }    
 }

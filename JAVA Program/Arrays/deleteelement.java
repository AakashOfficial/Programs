//delete an element in array in java
import java.util.*;
class deleteelement {
 public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int size=Integer.parseInt(args[0]);
    int arr[]=new int[size];
    for(int i=0;i<size;i++) 
     {
      System.out.println("Enter element :"+i);
      arr[i]=s.nextInt();
     }
    System.out.println("Accessing array");
     for(int i=0;i<size;i++)
      {
       System.out.println("arr["+i+"]:"+arr[i]);
       }
    System.out.println("Enter element want to be deleted");
    int del=s.nextInt();
    for(int i=0;i<size;i++)
      {
        if(arr[i]==del)
          {
            for(int j=i;j<size-1;j++)
             {
               arr[j]=arr[j+1];
             }
          }
         else
           {
             System.out.println("Element is not found");
           }
       }  
    System.out.println("New array is");
    for(int i=0;i<(size-1);i++)
      {
        System.out.println(arr[i]+"  ");
      }
   }    
 }

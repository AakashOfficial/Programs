//Store character in two dimensional array in java
import Java.Util.Scanner;
Class Charintwodarray {
 public static void main(String arr[]) {
    Scanner s=new Scanner(System.in);
    int size=Integer.parseInt(arr[0]);
    char arr[]=new char[size];
    for(int i=0;i<size;i++) 
     {
         System.out.println("Enter element :"+i);
         arr[i]=s.nextLine().charAt(0);
      }
    System.out.println("Accessing array-");
     for(int i=0;i<size;i++)
      {
          System.out.println("arr["+i+"] :+arr[i]);
      }    
   }
 }

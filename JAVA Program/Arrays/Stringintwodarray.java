//Store String in two dimensional array in java
import java.util.*;
class Stringintwodarray {
 public static void main(String arr[]) {
    Scanner s=new Scanner(System.in);
    int size=Integer.parseInt(arr[0]);
    String array[]=new String[size];
    for(int i=0;i<size;i++) 
     {
         System.out.println("Enter element :"+i);
         arr[i]=s.nextLine();
      }
    System.out.println("Accessing array-");
     for(int i=0;i<size;i++)
      {
          System.out.println("arr["+i+"] :"+arr[i]);
      }    
   }
 }

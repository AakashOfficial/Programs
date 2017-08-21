//find duplicate element in array in java
import Java.Util.Scanner;
Class Duplicateelement {
 public static void main(String arr[]) {
    Scanner S=new Scanner(System.in);
    int size=Integer.parseInt(arr[0]);
    int arr[]=new int(size);
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
    for(int i=0;i<arr.length-1;i++)
      {
         for(int j=i+1;j<arr.length;j++)
           {
             if((arr[i].equals(arr[j]))&&(i!=j))
              {
              system.out.println(arr[j]+"is duplicate");
              }
           }
     }
   }    
 }

//How to use one dimensional array in java
import Java.Util.Scanner;
Class Arrayinjava {
 public static void main(String arr[]) {
    Scanner S=new Scanner(System.in);
    int size=Integer.parseInt(arr[0]);
    int arr[]=new int(size);
                                        /*int arr[]=new int(Integer.parseInt(arr[0]));*/
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
   }    
 }

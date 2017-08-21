//delete an element in array in java by taking delete element from command line argument
import Java.Util.Scanner;
Class Deleteelementbycommand {
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
    System.out.println("Enter element want to be deleted");
    int del=Integer.parseInt(arr[1]);
    for(i=0;i<size;i++)
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
    for(i=0;i<(size-1);i++)
      {
        System.out.println(arr[i]+"  ");
      }
   }    
 }

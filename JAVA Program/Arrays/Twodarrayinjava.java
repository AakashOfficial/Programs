//How to use two dimensional array in java
import java.util.Scanner;
class Twodarrayinjava {
 public static void main(String args[]) {
    int i,j;
    Scanner s=new Scanner(System.in);
    int row=Integer.parseInt(args[0]);
    int col=Integer.parseInt(args[1]);
    int arr[][]=new int[row][col];
    for(i=0;i<row;i++) 
     {
       for(j=0;i<col;j++) 
        {
          System.out.println("Enter element");
           arr[i][j]=s.nextInt();
         }
     }
    System.out.println("Accessing array");
     for(i=0;i<row;i++) 
     {
       for(j=0;i<col;j++) 
        {
         System.out.println(arr[i][j]+"  ");
        }
        System.out.println();
     }    
   }
}
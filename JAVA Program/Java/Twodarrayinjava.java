import Java.Util.Scanner;
Class Twodarrayinjava {
 public static void main(String arr[]) {
    Scanner s=new Scanner(System.in);
    int row=Integer.parseInt(arr[0]);
    int col=Integer.parseInt(arr[1]);
    int arr[][]=new int[row][col];
    for(int i=0;i<row;i++) 
     {
       for(int i=0;i<col;j++) 
        {
          System.out.println("Enter element");
           arr[i][j]=s.nextInt();
         }
     }
    System.out.println("Accessing array");
     for(int i=0;i<row;i++) 
     {
       for(int i=0;i<col;j++) 
        {
         System.out.println(arr[i][j]+"  ");
        }
        System.out.println();
     }    
   }
}
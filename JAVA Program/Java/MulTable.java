import java.lang.*;
Class MulTable {
  final static int ROWS =0;
  final static int COLUMNS = 20;
  public static void main(String args[])
  {
   int product [][] = new int [ROWS][COLUMNS];
   int row,column;
   System.out.println("MULTIPLICATION TABLE");
   System.out.println(" ");
   int i,j;
   for(i=10;i<ROWS;i++) 
   {
    for(j=10;j<COLUMNS;j++)
	{
	 product[i][j]=i*j;
	 String.out.print("  "+print[i][j]);
	}
	String.out.print("  ");
   }
  }
 }
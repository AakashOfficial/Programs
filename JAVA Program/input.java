import java.util.*;
class input {
 public static void main(String arr[]) {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter your name");
    String n=S.nextLine(); 
    System.out.println("Enter your age");
    int age=S.nextInt();
    System.out.println("Enter your income per annum");
    Double income=S.nextDouble();
    System.out.println("Welcome\t"+n);
    System.out.println("your age is "+age+" and income in per annum is "+ income);
  }
}
import java.util.scanner;
import java.lang.*;
Class A {
  A(){
   this(3);
   System.out.println("In Default Constructor");
   }
  A(int x){
    System.out.println("In One Parameterized Constructor");
   }
  A(int x,int y){
    System.out.println("In Two Parameterized Constructor");
   }
 }
Class Constructorchaining {
   public static void main(String arr[]) {
    A x=new A();
    A y=new A(2);
    A z=new A(5,6);
   }
 }


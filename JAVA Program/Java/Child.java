class Parent{
 void Son(){
   System.out.println("checking");
  } 
 }
class Child extends Parent{
  void Son(){
    System.out.println("Not checking");
  }
  public static void main(String arr[]){  
    Parent p = new Parent();  
    p.Son();  
  }  
}  
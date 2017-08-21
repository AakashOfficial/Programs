Class A 
 {
   int a;
   static{
     System.out.println("Class A is Loaded");   
    }
   A(int a){
	 System.out.println("Object of A is initialized");
	}
 }
Class B {
   B(){
     System.out.println("Object of B is initialized");
   }
   public void display(){
    System.out.println("display() of B is invoked");
   }
 }
Class C {
  static int c;
  static{
    c=5;
	System.out.println("Class C is loaded");
   }
 }
Class Testexample{
  public static void main(String arr[]){
    A x=new A(10);
	B y=new B();
	System.out,println("invoking display ob B");
	y.display();
	System.out.println("value of c ic +c.c");
	A k=new A(11);
   }
 }
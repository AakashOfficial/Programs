/*class box
 {
   int l,b,h,volume;	
   void volume(int l,int b,int h)
   {
	   volume=l*b*h;
   }
 }
 import java.util.*;
class bitwise_operator
 {
  public static void main(String args[])
   {
    ArrayList obj = new ArrayList();
	obj.add("A");
	obj.ensureCapacity(3);
	System.out.print(obj.size());
   }
 }
 interface calculate 
  {
	  void cal(int item);
  }
  class bitwise_operator implements calculate 
  {
	  int x;
	  public void cal(int item)
	  {
		  x=item*item;
	  }
  }
  class interfaces
   {
	   public static void main(String args[])
	   {
		   bitwise_operator arr =new bitwise_operator();
		   arr.x=0;
		   arr.cal(2);
		   System.out.print(arr.x);
	   }
   }
   import java.util.*;
   class bitwise_operator 
  {
	  public static void main(String args[])
	   {
		   bitwise_operator obj =new bitwise_operator();
	       obj.add("A");
		   obj.add("B");
		   obj.add("C");
		   obj.add(1,"D");
		   System.out.print(obj);
	   }
  }*/
  /* File name : EncapTest.java */
public class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}

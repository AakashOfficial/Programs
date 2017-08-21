import java.util.Vector;
import java.util.ListIterator;
class Vector_Check
 {
  public static void main(String args[])
   {
     System.out.println("Creating Vector..");
	 Vector <String> v=new Vector<>();
	 v.add("Dupak");
	 v.add("Praveen");
	 ListIterator<String> l1=new ListIterator<>();
	 while(l1.nextElement())
	  {
	   System.out.println(v);
	  }
   }
 }
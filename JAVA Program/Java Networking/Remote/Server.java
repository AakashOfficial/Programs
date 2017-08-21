Class A implements Adder extends UnicastRemoteObject
 {
  A()
   {
    Super();
   }
  public int add()
   {
    return x+y;
   }
 }
 
 class Server
  {
   public ststic void main(String args[]) throws RemoteException
    {
	 try
	  {
	   A a1 = new A();
	   Naming.rebind("Rm:localhost:6666\add I",a1);
	  }
	 catch(RemoteException re)
	  {
	    System.out.print(re);
	  }
	}
  }
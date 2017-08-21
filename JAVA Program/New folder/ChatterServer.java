import java.net.*;
import java.io.*;
import java.util.*;
class ChatterServer
 {
  static int final INPORT=1711;
  private byte[] buf=new byte[1000];
  private DatagramPacket dp =new DatagramPacket(buf,buf.length);
  
  private DatagramSocket socket;
  
  public ChatterServer()
   {
	try
     {
      socket = new DatagramSocket(INPORT);
	  System.out.println(Server Started);
	  while(true)
	   {
	    socket.receive(dp);
	    String rcvd = Dgram.toString(dp) +"",from address:" +dp.getAddrerss() +", port: " +dp.getPort();
		System.out.println(rcvd);
		String echoString "Echoed: "+rcvd;
		DatagramPacket echo = Dgram.toDatagram(echoString,dp.getAddress(),dp.getPort());
		socket.send(echo);
	   }
	  }
	 catch(SocketException e)
	  {
	   System.err.println("Can't Open Socket");
	   System.exit(1);
	  }
	 catch(IOExceptoion e)
	  {
	   System.err.println("Communication Error");
	   e.printStackTrace();
	  }
    }
  public static void main(String args[])
   {
    new ChatterServer();
   }
 }

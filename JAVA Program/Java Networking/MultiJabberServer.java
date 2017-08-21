import java.net.*;
import java.io.*;
import java.util.*;
class ServeMultiClient extends Thread
 {
  private Socket socket;
  private BufferedReader in;
  private PrintWriter out;
  
  public ServeMultiClient(Socket s) throws IOException
   {
     socket = s;
	 in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	 out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
	 start();
   }
   
  public void run()
   {
    try
	 {
	  while(true)
	   {
	    String str = in.readLine();
		if (str.equals("END")) break;
		System.out.println("Echoing: "+str);
		out.println(str);
	   }
	  System.out.println("Closing..."); 
	 }
	 catch(IOException e)
	  {
	  }
     finally 
	  {
	   try
	    {
		 socket.close();
		}
	   catch(IOException e)
	    {
		}
	  }	  
   }
 }

public class MultiJabberServer
 {
  static final int PORT = 8080;
  public static void main(String args[]) throws IOException
   {
    ServerSocket s = new ServerSocket(PORT);
	System.out.println("Server Started");
	try 
	 {
	  while(true)
	   {
	    Socket socket = s.accept();
		try
		 {
		  new ServeMultiClient(socket);
		 }
		catch(IOException e)
		 {
		  socket.close();
		 }
	   }
	 }
	finally
	 {
	  s.close();
	 }
   }
 }
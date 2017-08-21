/*: JabberClient.java
very simple client that just sends lines to the server and reads lines that the server sends*/
import java.net.*;
import java.io.*;
import java.util.*;
public class JabberClient
 {
  public static void main(String args[]) throws IOException
  /* Passing null to getByName() produces the special "Local loopback" IP address, for testing on one machine w/o a network: */
   {
    InetAddress addr =InetAddress.getByName(null);
	System.out.println("addr ="+addr);
	Socket socket = new Socket(addr, JabberServer.PORT);
	try
	 {
	  System.out.println("socket ="+socket);
	  BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	  PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
	  for(int i=0;i<10;1++)
	   {
	    out.println("howdy"+i);
		String str = in.readLine();
		System.out.println(str);
	   }
	  finally
	   {
	    Sustem.out.println("Closing....");
		socket.close();
	   }
	 }
   }
 }
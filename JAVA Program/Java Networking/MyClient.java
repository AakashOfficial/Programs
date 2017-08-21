import java.net.*;
import java.io.*;
class MyClient
 {
  public static void main(String args[])throws Exception
   {
    ServerSocket ss=new ServerSocket("localhost",3333);
	Socket s=ss.accept();
	DataInputStream din = new DataInputStream(s.getInputStream());	
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str="",str2="";
	while(!str.equals("Stop"))
	 {
	  str=br.readLine();
	  dout.writeUTF(str);
	  dout.flush();
	  str=din.readUTF();	  
	  System.out.println("Server Says:"+str2);
	 }
	 dout.close();
	 s.close();
   }
 }

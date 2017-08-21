import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
class ServerFrame implements ActionListener,WindowListener
 {
   String  str,str2;
   DataInputStream din;
   DataOutputStream dout;
   BufferedReader br;
   ServerSocket ss;
   Socket s;
   Frame f;
   Label l1,l2;
   TextField t1,t2;
   Button b;
   ServerFrame() throws Exception
   {
     f = new Frame("Chating");
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(600,500);
     l1 = new Label("Send");
     l1.setBounds(100,100,60,30);
     l2 = new Label("Receive");
     l2.setBounds(100,200,60,30);
     t1 = new TextField();
     t1.setBounds(200,100,60,30);	 
     t2 = new TextField();
     t2.setBounds(200,200,60,30);
     b = new Button("Login");
     b.setBounds(100,400,60,40);
     b = new Button("Click");
     b.setBounds(100,500,60,40);	 
     f.add(l1);
	 f.add(t1);
     f.add(l2);
	 f.add(t2);
     f.add(b);	 
     b.addActionListener(this);
	 f.addWindowListener(this);
   }
   public void actionPerformed(ActionEvent e)
    {
	 try
	 {
	  ss=new ServerSocket(3333);
	  s=ss.accept();
	  din = new DataInputStream(s.getInputStream());	
	  dout = new DataOutputStream(s.getOutputStream());
	  br = new BufferedReader(new InputStreamReader(System.in));
	  String str=t1.getText(),str2;
	  while(!str.equals("Stop"))
	   {
	    str=din.readUTF();
	    t2.setText(str);
	    str2=br.readLine();
	    dout.writeUTF(str2);
	    dout.flush();
	   }
	  }
	 catch(IOException ie)
	 {
		System.out.println(ie);
	 }
	 finally
	  {
	   din.close();
	   s.close();
	   ss.close();
      }	   
    }
   public void windowOpened(WindowEvent e) {}
   public void windowClosing(WindowEvent e) {
         System.exit(0);}
   public void windowClosed(WindowEvent e) {}
   public void windowIconified(WindowEvent e) {}
   public void windowDeiconified(WindowEvent e) {}
   public void windowActivated(WindowEvent e) {}
   public void windowDeactivated(WindowEvent e) {}
   public static void main(String args[])
    {
	  new ServerFrame();
	}
 }
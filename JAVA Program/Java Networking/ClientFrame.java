import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class ClientFrame implements ActionListener,WindowListener
 {
   String str,str2;
   Frame f;
   Label l1,l2;
   TextField t1,t2;
   Button b1;
   ClientFrame() throws Exception
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
     b1 = new Button("Click");
     b.setBounds(100,500,60,40);	 
     f.add(l1);
	 f.add(t1);
     f.add(l2);
	 f.add(t2);
     f.add(b1);	 
     b.addActionListener(this);
	 f.addWindowListener(this);
   }
   public void actionPerformed(ActionEvent e)
    {
	 ServerSocket ss=new ServerSocket("localhost",3333);
	 Socket s=ss.accept();
	 DataInputStream din = new DataInputStream(s.getInputStream());	
	 DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String str=t1.getText(),str2;
	 while(!str.equals("Stop"))
	  {
	   str=br.readLine();
	   dout.writeUTF(str);
	   dout.flush();
	   str=din.readUTF();	  
	   t2.setText(System.out.println(str2));
	  }
	 dout.close();
	 s.close();     	  
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
	  new ClientFrame();
	}
 }
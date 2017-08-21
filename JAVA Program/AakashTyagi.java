 import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class AakashTyagi implements ActionListener,WindowListener
 {
   Frame f,f2,f3;
   Label l1,l2,l3,msgLabel,msgLabel2,l4;
   TextField t1,t2;
   Button b;
   AakashTyagi()
   {
     f = new Frame("Login Page");
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(600,500);
     l1 = new Label("User ID");
     l1.setBounds(100,100,60,30);
     l2 = new Label("Password");
     l2.setBounds(100,200,60,30);
     l3 = new Label();
     l3.setBounds(100,300,140,30);
	 l4 = new Label();
	 l4.setBounds(100,500,80,60);
     t1 = new TextField();
     t1.setBounds(200,100,60,30);	 
     t2 = new TextField();
     t2.setBounds(200,200,60,30);
     b = new Button("Login");
     b.setBounds(100,400,60,40);	 
     f.add(l1);
	 f.add(t1);
     f.add(l2);
	 f.add(t2);
     f.add(l3);	
     f.add(b);
     f.add(l4);	 
     b.addActionListener(this);
	 f.addWindowListener(this);
   }
   public void actionPerformed(ActionEvent e)
    {
	 String a = t1.getText();
	 String b = t2.getText();
	 if(a.equals("Aakash") && b.equals("Tyagi"))
	  {	
	   l3.setText("Login Successfull");
	   f2 = new Frame();
       f2.setSize(300,200);;
       f2.setTitle("Second Frame");
       msgLabel = new Label("WELCOME");
       msgLabel.setAlignment(Label.CENTER);
       msgLabel.setSize(100,100);
       f2.add(msgLabel);
       f2.setVisible(true);
	   l4.setText("In Second Window");
	   f.setBackground(Color.red);
	   f2.setBackground(Color.blue);
	   f2.addWindowListener(this);
	  }
	 else
	  {
	   l3.setText("Login Unsuccessfull");
	   f3 = new Frame();
       f3.setSize(300,200);;
       f3.setTitle("Third Frame");
       msgLabel2 = new Label("Please Enter Correct UserID and Password");
       msgLabel2.setAlignment(Label.CENTER);
       msgLabel2.setSize(100,100);
       f3.add(msgLabel);
       f3.setVisible(true);
	   l4.setText("In Second Window");
	   f.setBackground(Color.green);
	   f3.setBackground(Color.red);
	   f3.addWindowListener(this);
	  }
      	  
	}
	public void windowOpened(WindowEvent e) {}

      public void windowClosing(WindowEvent e) {
         System.exit(0);		 
      }
      public void windowClosed(WindowEvent e) {}
      public void windowIconified(WindowEvent e) {}
      public void windowDeiconified(WindowEvent e) {}
      public void windowActivated(WindowEvent e) {}
      public void windowDeactivated(WindowEvent e) {}
   public static void main(String args[])
    {
	  new AakashTyagi();
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 create table Aakash
 (
  name varchar2(25)not null,
  roll_no varchar2(3)primary key,
  section char(1),
  marks number(3)not null,
  address varchar2(30) unique,
  height number(3) not null,
  rank number(3)
 )
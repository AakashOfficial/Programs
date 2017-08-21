import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class AAKASHTY implements ActionListener
 {
   Frame f;
   Panel p;
   Label l1,l2,l3;
   TextField t1,t2;
   Button b;
   AakashTyai()
   {
     f = new Frame("Login Page");
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(700,650);
	 p = new Panel();
	 p.setSize(600,500);
     l1 = new Label("User ID");
     l1.setBounds(100,100,60,30);
     l2 = new Label("Password");
     l2.setBounds(100,200,60,30);
     l3 = new Label();
     l3.setBounds(100,300,60,30);
     t1 = new TextField();
     t1.setBounds(200,100,60,30);	 
     t2 = new TextField();
     t2.setBounds(200,200,60,30);
     b = new Button("Login");
     b.setBounds(100,400,60,40);	 
	 p.add(l1);
	 p.add(t1);
     p.add(l2);
	 p.add(t2);
     p.add(l3);	
     p.add(b);
     f.add(p);	 
     b.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
    {
	  l3.setText("Welcome");
      p.setBackground(Color.red);
	}
   public static void main(String args[])
    {
	  new AakashTyagi();
	}
 }
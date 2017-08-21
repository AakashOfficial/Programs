import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class LoginDatabase implements ActionListener,WindowListener
 {
   int basic,gross,hra,da;
   
   Frame f;
   Panel p;
   Label l1,l2,l3,l4;
   TextField t1,t2,t3,t4;
   Button b;
   LoginDatabase()
   {
     f = new Frame("Login Page");
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(800,800);
	 p = new Panel();
	 p.setSize(750,750);
	 p.setVisible(true);
	 p.setLayout(null);
     l1 = new Label("User ID");
     l1.setBounds(100,100,60,30);
     l2 = new Label("Password");
     l2.setBounds(100,200,60,30);
     l3 = new Label("Basic Salary");
     l3.setBounds(100,300,60,30);
	 l4 = new Label("Gross Salary");
     l4.setBounds(100,400,60,30);
     t1 = new TextField();
     t1.setBounds(200,100,60,30);	 
     t2 = new TextField();
     t2.setBounds(200,200,60,30);
	 t3 = new TextField();
     t3.setBounds(200,300,60,30);
	 t4 = new TextField();
     t4.setBounds(200,400,60,30);
     b = new Button("Login");
     b.setBounds(150,600,60,40);
     f.add(p);	 
	 p.add(l1);
	 p.add(t1);
     p.add(l2);
	 p.add(t2);
     p.add(l3);
	 p.add(t3);
     p.add(l4);
	 p.add(t4);	 
     p.add(b);	 
     b.addActionListener(this);
	 f.addWindowListener(this);
   }
   public void actionPerformed(ActionEvent e)
    { 
	  basic=Integer.parseInt(t3.getText());
	  
      p.setBackground(Color.red);
	  hra=0.1*basic;
	  da=0.8*basic;
	  gross=basic+hra+da;
	  t4.setText(gross);
	}
   public void windowOpened(WindowEvent e) {
      }

   public void windowClosing(WindowEvent e) {
         System.exit(0);		 
      }
      
   public void windowClosed(WindowEvent e) {
      }

   public void windowIconified(WindowEvent e) {
      }

   public void windowDeiconified(WindowEvent e) {
      }

   public void windowActivated(WindowEvent e) {
      }

   public void windowDeactivated(WindowEvent e) {
      }
   public static void main(String args[])
    {
	  new LoginDatabase();
	}
 }
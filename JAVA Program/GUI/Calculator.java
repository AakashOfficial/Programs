import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener,WindowListener
 {
   Frame f,f2,f3;
   Label l1,l2,l3;
   TextField t1,t2,t3;
   Button b1,b2,b3,b4,b5,b6;
   Calculator()
   {
     f = new Frame("Simple Calculator");
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(600,500);
     l1 = new Label("Enter no.");
     l1.setBounds(100,100,60,30);

     l2 = new Label("Enter No.");
     l2.setBounds(100,200,60,30);
     l3 = new Label("Result");
     l3.setBounds(100,300,60,30);
     t1 = new TextField();
     t1.setBounds(200,100,60,30);	 
     t2 = new TextField();
     t2.setBounds(200,200,60,30);
	 t3 = new TextField();
     t3.setBounds(200,300,60,30);
     b1 = new Button("Subtract");
     b1.setBounds(100,400,60,40);
     b2 = new Button("Add");
     b2.setBounds(200,400,60,40);
     b3 = new Button("Multiply");
     b3.setBounds(300,400,60,40);
     b4 = new Button("Divide");
     b4.setBounds(400,400,60,40);
     b5 = new Button("Modulus");
     b5.setBounds(500,400,60,40);
     b6 = new Button("Exit");
     b6.setBounds(600,400,60,40);	 
     f.add(l1);
	 f.add(t1);
     f.add(l2);
	 f.add(t2);
     f.add(l3);
     f.add(t3);	 
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(b4);
     f.add(b5);
     f.add(b6);	 
     b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
	 b5.addActionListener(this);
	 b6.addActionListener(this);
	 f.addWindowListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
     int n1=Integer.parseInt(t1.getText());
	 int n2=Integer.parseInt(t2.getText());
	 
	 String sub=Integer.toString(n1-n2);
	 String add=Integer.toString(n1+n2);
	 String mul=Integer.toString(n1*n2);
	 String div=Integer.toString(n1/n2);
	 String mod=Integer.toString(n1%n2);
	  if(e.getSource()==b1) { t3.setText(sub);}
	  if(e.getSource()==b2) { t3.setText(add);}
	  if(e.getSource()==b3) { t3.setText(mul);}
	  if(e.getSource()==b4) { t3.setText(div);}
	  if(e.getSource()==b5) { t3.setText(mod);}
	  if(e.getSource()==b6) { System.exit(0);}
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
	  new Calculator();
	}
 }
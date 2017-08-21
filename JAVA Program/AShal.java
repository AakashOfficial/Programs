import java.awt.*;
import java.awt.event.*;

public class AShal implements ActionListener,WindowListener 
{
   Frame f1,f2;
   Label msgLabel,l1;
   Panel p;
   Button b;

   public AShal(){
      f1 = new Frame("Click Page");
      f1.setSize(500,500);
      f1.setLayout(null);
	  	
	 
      l1 = new Label("In First Window or Frame");        
      l1.setBounds(300,200,200,30);

      
      b = new Button("Click Me");
	  b.setBounds(250,250,60,60);
   
      f1.add(l1);
	  f1.add(b);
      f1.setVisible(true);
      
     b.addActionListener(this);
     f1.addWindowListener(this);
   }	 
    public void actionPerformed(ActionEvent e)
	 {
	 
      f2 = new Frame();
      f2.setSize(300,200);;
      f2.setTitle("Second Frame");
    

      msgLabel = new Label("WELCOME");
      msgLabel.setAlignment(Label.CENTER);
      msgLabel.setSize(100,100);
      f2.add(msgLabel);
      f2.setVisible(true);
	  l1.setText("In Second Window");
	  
	  f2.addWindowListener(this);
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
   
   public static void main(String[] args)
    {
	  new AShal();	
	}
}
   
   
   
   
   
   
     
   
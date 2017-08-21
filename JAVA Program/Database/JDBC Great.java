import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class JDBC implements ActionListener,WindowListener
 {
   Frame f,f2,f3,f4,f5;
   Label lf1,lf21,lf22,lf23,lf24,lf25;
   TextField tf21,tf22,tf23;
   Button b1,b2,b3,b4,b5,b6,bf21,bf22;
   JDBC()
   {
     f = new Frame("Data Base");
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(320,500);
	 
     lf1 = new Label("My Database");
     lf1.setBounds(150,100,80,30);

	 
     b1 = new Button("Insert Data");
     b1.setBounds(150,150,80,40);
	 
     b2 = new Button("Update Data");
     b2.setBounds(150,210,80,40);
	 
     b3 = new Button("Delete Data");
     b3.setBounds(150,270,80,40);
	 
     b4 = new Button("Retrieve Data");
     b4.setBounds(150,330,80,40);
	 
     b5 = new Button("Exit");
     b5.setBounds(150,390,80,40);
	 
     f.add(lf1);	
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(b4);
     f.add(b5);
     	 
	 f.addWindowListener(this);
     b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
	 b5.addActionListener(this);
	
   }
   public void actionPerformed(ActionEvent e)
   {
    	
	if(e.getSource()==b1) 
	 { 
      f=new Frame("Data Insert");
	  f.setVisible(true);
	  f.setLayout(null);
	  	  
	  lf21=new Label("Enter Data");
	  lf21.setBounds(150,30,100,30);
	  	  
	  lf22=new Label("Name");
	  lf22.setBounds(100,100,70,30);
	  	  
	  lf23=new Label("Roll No.");
	  lf23.setBounds(100,200,70,30);
	  	  
	  lf24=new Label("Branch");
	  lf24.setBounds(100,300,70,30);
	  	  
	  lf25=new Label();
	  lf25.setBounds(150,370,70,30);
	  	  
	  tf21=new TextField();
	  tf21.setBounds(200,100,60,30);
	
      tf22=new TextField();
	  tf22.setBounds(200,200,60,30);
	  
	  tf23=new TextField();
	  tf23.setBounds(200,300,60,30);
	  
	  bf21=new Button("Submit");
	  bf21.setBounds(130,430,70,40);
	  
	  f2.add(lf21);
	  f2.add(lf22);
	  f2.add(tf21);
	  f2.add(lf23);
	  f2.add(tf22);
	  f2.add(lf24);
	  f2.add(tf23);
	  f2.add(lf25);
	  f2.add(bf21);
	  f2.add(bf22);
	  bf21.addActionListener(this);
	  //bf22.addActionListener(this);
	  f2.addWindowListener(this);
	 }
    	
	public void actionPerformed(ActionEvent ae)
	 {
	  if(ae.getSource()==bf21) 
	   { 
		String a=tf21.getText();
        int b=Integer.parseInt(tf22.getText());
        String c=tf23.getText();		
		 
		try
		 {
           Class.forName("com.mysql.jdbc.Driver");
	
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakashtwo","root","@aakash");
	
	       Statement stmt=con.createStatement();
	       int i=stmt.executeUpdate("insert into information values('"+a+"',"+b+",'"+c+"')");
	       System.out.println("Updated"+i);
		   if(i==1)
		    {
				lf24.setText("Data Inserted");
			}
		   if(i<1)
		    {
			    lf24.setText("Data Not Inserted");
		    }
	       con.close();
         }catch(Exception e) { e.printStackTrace(); }
	   }
	   if(ae.getSource()==bf22) {System.exit(0);}
	 }
   }
	
	  //if(e.getSource()==b2) { t3.setText(add);}
	  //if(e.getSource()==b3) { t3.setText(mul);}
	  //if(e.getSource()==b4) { t3.setText(div);} 
	  //if(e.getSource()==b5) { System.exit(0);} 
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
	  new JDBC();
	}
 }
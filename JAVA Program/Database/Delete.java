import java.awt.*;
import java.awt.event.*;;
import java.util.*;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Delete implements ActionListener,WindowListener
 {
   Frame f;
   Label l,l1,l2;
   TextField t1;
   Button b;
   
   Delete()
    {
      f=new Frame("Database Delete Data Form");
	  f.setVisible(true);
	  f.setLayout(null);
	  f.setSize(700,600);
	  
	  l=new Label("Enter Data");
	  l.setBounds(150,30,100,30);
	  l.setBackground(Color.blue);
	  
	  l1=new Label("Rollno");
	  l1.setBounds(100,100,70,30);
	  l1.setBackground(Color.blue);
	  
	  l2=new Label();
	  l2.setBounds(130,220,70,30);
	  l2.setBackground(Color.blue);
	  
	  t1=new TextField();
	  t1.setBounds(200,100,60,30);
	  
	  b=new Button("Submit");
	  b.setBounds(130,300,70,40);
	  
	  f.add(l);
	  f.add(l1);
	  f.add(t1);
	  f.add(l2);
	  f.add(b);
	  b.addActionListener(this);
	  f.addWindowListener(this);
    }
	
	public void actionPerformed(ActionEvent ae)
	 {
		int a=Integer.parseInt(t1.getText());		
		 
		try
		 {
           Class.forName("com.mysql.jdbc.Driver");
	
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakashtwo","root","@aakash");
	
	       Statement stmt=con.createStatement();
	       int i=stmt.executeUpdate("delete from information where rollno=("+a+")");
	       System.out.println("Deleted Data"+i);
		   if(i==1)
		    {
				l2.setText("Data Deleted");
			}
		   if(i<1)
		    {
			    l2.setText("Data Not Deleted");
		    }
	       con.close();
         }
		catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	public void windowOpened(WindowEvent we) 
	 {
	   System.out.println("Window Opened");	
	 } 

    public void windowClosing(WindowEvent we) 
	 {
         System.exit(0);
         System.out.println("Window Closing");		 
     }
      
    public void windowClosed(WindowEvent we) 
	 {
		 System.out.println("Window Closed");
	 }

    public void windowIconified(WindowEvent we)
 	 {
		 System.out.println("Window Iconified");
	 }

    public void windowDeiconified(WindowEvent we) 
	 {
		 System.out.println("Window Deiconified");
	 }

    public void windowActivated(WindowEvent we) 
	 {
		 System.out.println("Window Activated");
	 }

    public void windowDeactivated(WindowEvent we)
     {
		 System.out.println("Window Deactivated");
	 }
	
	public static void main(String args[])
	 {
		 new Delete();
	 }
 }
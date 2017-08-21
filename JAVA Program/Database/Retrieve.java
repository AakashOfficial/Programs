import java.awt.*;
import java.awt.event.*;;
import java.util.*;
import java.lang.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


class Show implements ActionListener,WindowListener
 {
   Frame f;
   Label l,l1,l2,l3,l4;
   TextField t1,t2,t3;
   Button b;
   
   Show()
    {
      f=new Frame("Database Form");
	  f.setVisible(true);
	  f.setLayout(null);
	  f.setSize(700,600);
	  
	  l=new Label("Retrieve Data");
	  l.setBounds(150,30,100,30);
	  l.setBackground(Color.blue);
	  
	  l1=new Label("Name");
	  l1.setBounds(100,100,70,30);
	  l1.setBackground(Color.blue);
	  
	  l2=new Label("Roll No.");
	  l2.setBounds(100,200,70,30);
	  l2.setBackground(Color.blue);
	  
	  l3=new Label("Branch");
	  l3.setBounds(100,300,70,30);
	  l3.setBackground(Color.blue);
	  
	  l4=new Label();
	  l4.setBounds(150,370,70,30);
	  l4.setBackground(Color.blue);
	  
	  t1=new TextField();
	  t1.setBounds(200,100,60,30);
	
      t2=new TextField();
	  t2.setBounds(200,200,60,30);
	  
	  t3=new TextField();
	  t3.setBounds(200,300,60,30);
	  
	  b=new Button("Submit");
	  b.setBounds(130,430,70,40);
	  
	  f.add(l);
	  f.add(l1);
	  f.add(t1);
	  f.add(l2);
	  f.add(t2);
	  f.add(l3);
	  f.add(t3);
	  f.add(l4);
	  f.add(b);
	  b.addActionListener(this);
	  f.addWindowListener(this);
    }
	
	public void actionPerformed(ActionEvent ae)
	 {
        int b=Integer.parseInt(t2.getText());
        		
		 
		try
		 {
           Class.forName("com.mysql.jdbc.Driver");
	
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aakashtwo","root","@aakash");
	
	       Statement stmt=con.createStatement();
	       ResultSet s=stmt.executeQuery("select * from informaton where rollno=("+b+")");
		   
		   while(s.next())  
		   {   
		     t1.setText(s.getString(1));
		     t2.setText(Integer.toString(s.getInt(2)));
		     t3.setText(s.getString(3));
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
		 new Show();
	 }
 }
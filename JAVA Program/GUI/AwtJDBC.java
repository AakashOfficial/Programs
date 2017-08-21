import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class AwtJDBC implements ActionListener,WindowListener{
   Frame f;
   Label l1,l2,l3,l4,l5,msgLabel,title;
   TextField t1,t2,t3,t4,t5;
   Button b;
   
   Connection con;
   
   int rollno;
   String firstname,lastname,address,email;
	   
   AwtJDBC(){
     f = new Frame("Login Page");
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(800,500);
	 
     l1 = new Label("Roll No");
     l1.setBounds(100,100,70,30);
	 
     l2 = new Label("First Name");
     l2.setBounds(100,170,70,30);
	 
     l3 = new Label("Last Name");
     l3.setBounds(100,240,70,30);
	 
	 l4 = new Label("Address");
     l4.setBounds(100,310,70,30);
	 
	 l5 = new Label("Email");
     l5.setBounds(100,380,70,30);
	 
	 msgLabel = new Label();
     msgLabel.setBounds(150,540,70,30);

	 title = new Label("Enter Details");
     title.setBounds(150,40,80,30);
	 
     t1 = new TextField();
     t1.setBounds(200,100,70,30);
	 
     t2 = new TextField();
     t2.setBounds(200,170,70,30);
	 
	 t3 = new TextField();
     t3.setBounds(200,240,70,30);
	 
	 t4 = new TextField();
     t4.setBounds(200,310,70,30);
	 
	 t5 = new TextField();
     t5.setBounds(200,380,70,30);
	 
     b = new Button("Login");
     b.setBounds(150,460,70,40);
      
	 //Adding Components To The Frame
     f.add(title);	  
	 f.add(l1);
	 f.add(t1);
     f.add(l2);
	 f.add(t2);
     f.add(l3);
     f.add(t3);
     f.add(l4);
     f.add(t4);
     f.add(l5);	
     f.add(t5);	 
     f.add(b);
	 f.add(msgLabel);
     
	 //Registering The Listener
	 b.addActionListener(this);
	 f.addWindowListener(this);
   }
   //Getter Setter Methods Starts Here
  public int getRollno(){
		  return rollno;
	  }
	  public void setRollno(int rollno){
		  this.rollno=rollno;
	  }
	  public String getFirstname(){
		  return firstname;
	  }
	  public void setFirstname(String firstname){
		  this.firstname=firstname;
	  }
	  public String getLastname(){
		  return lastname;
	  }
	  public void setLastname(String lastname){
		  this.lastname=lastname;
	  }
	  public String getAddress(){
		  return address;
	  }
	  public void setAddress(String address){
		  this.address=address;
	  }
	  public String getEmail(){
		  return email;
	  }
	  public void setEmail(String email){
		  this.email=email;
	  }
	  
	  public String toString(){
		  return "MyData[rollno=" + rollno +",firstname=" + firstname + ", lastname=" + lastname +",address=" + address +",email="+ email +"]";
	  }
	  //Getter Setter Methods Ends Here
	  
	  //Creating Connection With Database
   public static Connection getCon()throws Exception{
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aakashtwo","root","@aakash");
	 return con;
 }
	  
	  //Add Method
	  public boolean addData(){
	   String insertQuery="insert into mydata values("+getRollno()+",'"+getFirstname()+"','"+getLastname()+"','"+getAddress()+"','"+getEmail()+"')";
	   try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(insertQuery);
		   if(i==1){
		   System.out.println("Data is inserted with price"+getRollno());
		   
		   return true;
		   }
	   }catch(Exception e){e.printStackTrace();}
	   return false;
   }
     
   public void actionPerformed(ActionEvent ae){
	 rollno = Integer.parseInt(t1.getText());
	 firstname = t2.getText();
	 lastname = t3.getText();
	 address = t4.getText();
	 email = t5.getText();
	 
	 addData();
	 
   }
	
  //Window Listener Interface Methods
  public void windowOpened(WindowEvent e) {}

  public void windowClosing(WindowEvent e) {
         System.exit(0);		 
  }
	
  public void windowClosed(WindowEvent e) {}
    
  public void windowIconified(WindowEvent e) {}
    
  public void windowDeiconified(WindowEvent e) {}
    
  public void windowActivated(WindowEvent e) {}
   
  public void windowDeactivated(WindowEvent e) {}
  
  public static void main(String args[]){
	  new AwtJDBC();
  }
 }
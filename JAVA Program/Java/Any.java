import Java.awt.*;
import Java.EventListener.*;
Class Any 
 {
  public static void main(String args[])
   {
    Frame f=new Frame("Converter");
	f.pack();
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	Label l1=new Label("F");
	l1.setBound(100,100,150,35);
	Label l2=new Label("C");
	l2.setBound(100,300,150,35);
	TextField t1=new TextField();
	t1.setBound(300,100,150,35);
	TextField t2=new TextField();
	t2.setBound(300,300,150,35);
	f.add(l1);
	f.add(t1);
	f.add(l2);
	f.add(t2);
	Button b=new Button("Convert");
	b.setBound(130,150,100,100);
	f.add(b);
	b.addActionListener(new BL());
   }
 }
Class BL implements ActionListener
 {
  public void actionperformed(ActionEvent evt)
   {
    String fa =t1.getText();
	int a = Integer.parseInt(fa);
	int c = (a-32)*(5/9);
	t2.setText(c);
   }
 }
  
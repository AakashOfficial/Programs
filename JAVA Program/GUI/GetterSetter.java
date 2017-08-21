import java.io.Serializable;

public class GetterSetter implements Serializable {

	  private int rollno;
	  private String firstname;
	  private String lastname;
	  private String address;
	  private String email;
	  
	  
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
}

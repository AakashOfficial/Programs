import java.io.Serializable;

public class Computer implements Serializable {
  private int price;
  private String sName;
  private String cName;
  private int quantity;
  
  public int getPrice(){
	  return price;
  }
  public void setPrice(int price){
	  this.price=price;
  }
  public String getSName(){
	  return sName;
  }
  public void setSName(String sName){
	  this.sName=sName;
  }
  public String getCName(){
	  return cName;
  }
  public void setCName(String cName){
	  this.cName=cName;
  }
  public int getquantity(){
	  return quantity;
  }
  public void setquantity(int quantity){
	  this.quantity=quantity;
  }
  public String toString(){
	  return "Computer[price=" + price +",sName=" + sName + ", cName=" + cName +",quantity=" + quantity +"]";
  }
}

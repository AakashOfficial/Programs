Class Swapper {
  int a,b;
  public Swapper(int a,int b){
    this.a=a;
	this.b=b;
  }
  public void swap(){
    int t;
	t=this.a;
	this.a=this.b;
	this.b=t;
  }
  public void display(){                     
    System.out.println("a="+a+\t"b="+b+);
  }
 }
Class Swaptwonum{
  public static void maain(Staring arr[]){
   Swapper swapper=new Swapper(10,20);
   Syatem.out.println("Before Swapping");
   swapper.display();
   swapper.swap();
   System.out.println("After Swapping");
   swapper.display();
  }
}

/* in this program display method is calling two time we can also call as swapper.display().swap().display();
 but in this case the display method does not return any value we use this for return a value (return this).this method return a value for next. this value
 is used as reference. Aur isliye jab return hoga to isliye hum display ka void hata denge. return type class ka hona chaiye.
  public Swapper display(){
    System.out.println("a="+a+\t"b="+b+);
    return this; 
}*/
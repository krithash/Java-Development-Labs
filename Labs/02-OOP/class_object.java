package Oops;

class car{                              //class
	String brand="Jaguar";
	
	void Display(){
		System.out.println("Brand is:"+brand);
	}
}

public class class_object {
   public static void main(String[] arg) {
	   car obj=new car();              //object of class
	   obj.Display();                  //calling class using object
   }
}

package Oops;

class demo{   
   demo(){
	   System.out.println("Constructor block executed");
   }
	   
   {
	   System.out.println("Instance block executed");
   }
      
   static {
	   System.out.println("Static block executed");
   }
}

public class types_of_blocks {
  public static void main(String[] arg) {
	  demo d1= new demo();
	  //above syntax Loads the class demo.
	  //This causes the static block to execute — but only once when the class is first loaded into memory.
	  //Creates an instance of the class.This causes the instance block to execute every time a new object is created.
	  //The constructor code runs immediately after the instance block.
	  demo d2= new demo();
	  //only instance block and constructor block executed this time. Bec already the class is been loaded into the memory during the first object d1 is being created.
  }
}

package Exceptional_handling;
import java.util.Scanner;

public class Multiple_Exception {
	  static Scanner obj=new Scanner(System.in); 
	  
	  void divide_AddToArray(int a, int b) {
		  double arr[]= new double[3];
		  String str=null;
		  
		  arr[0]=1;
		  arr[1]=2;
		  arr[2]=3;
		  
		  try {
			  double c=a/b;
			  System.out.println("Output is:"+c);  
		  }
		  
		  catch (ArithmeticException e) {
			    System.out.println("Error: Cannot divide by zero.");
			}
		  
		  try {
			  arr[3]=20;
		  }
		  	  
		  catch (ArrayIndexOutOfBoundsException e) {  //handles only index bound exception
			  System.out.println(e);
			  for(int i=0; i<arr.length; i++) {
				  System.out.println(arr[i]);
			  }
		  }
		  
		  try {
			  str=str.toUpperCase();
		  }
		  
		  catch (Exception e) {        //super class handles all type of unknown exceptions(there are many exceptions which we cant memorize)
			  System.out.println(e);
		  }
	  }
	  
      public static void main(String[] arg) {
	     System.out.println("Enter dividend:");
	     int dividend=obj.nextInt();
	     
	     System.out.println("Enter divisor:");
	     int divisor=obj.nextInt();
	     
	     Multiple_Exception object=new Multiple_Exception();
	     object.divide_AddToArray(dividend,divisor);
  }
}

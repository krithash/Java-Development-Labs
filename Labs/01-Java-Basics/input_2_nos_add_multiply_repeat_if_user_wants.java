package looping_statements;
import java.util.Scanner;

public class input_2_nos_add_multiply_repeat_if_user_wants {
	 public static void main(String[] arg) {
		   Scanner obj=new Scanner(System.in);		   
		   int sum= 0;
		   int product=0;
		   int request;
		   
		   do {			   
			   System.out.println("Enter the number 1:");
			   int num1=obj.nextInt();
			   
			   System.out.println("Enter the number 2:");
			   int num2=obj.nextInt(); 
			   
			   sum=num1+num2;
			   product=num1*num2;
			   
			   System.out.println("Sum = " + sum);
	           System.out.println("Product = " + product);
	           
			   System.out.println("To Repeat(Yes/No):");
			   request=obj.nextInt(); 
	        }while(request==1);
	 }
}

package looping_statements;
import java.util.Scanner;

public class Factorial_of_a_number {
	public static void main(String[] arg) {
		   Scanner obj=new Scanner(System.in);
		   System.out.println("Enter the num:");
		   int num=obj.nextInt();
		   
		   int i=num;
		   int factorial=1;
		   while(i>0) {
			   factorial=factorial*i;
			   System.out.println(" "+factorial);
			   i--;
		   }
		   System.out.println("Factorial of "+num+" is "+factorial);
	}

}

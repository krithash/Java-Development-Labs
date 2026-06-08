package if_ifelse;
import java.util.Scanner;

public class Finding_quotient_remainder_for_2_nos_on_given_condition {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);  //creating scanner object 
	   
	   System.out.println("Enter num 1:");
	   int m=obj.nextInt();                 // user input for 1st number
	   
	   
	   System.out.println("Enter num 2:");
	   int n=obj.nextInt();                 //user input for 2nd number
	   
	   System.out.println("num 1:" +m);
	   System.out.println("num 2:" +n);
	   
	   if(m>n) {
		   System.out.println("Quotient is:" +m/n);
		   System.out.println("Remainder is:" +m%n);
	   }
	   
	   else {
		   System.out.println("n<m");
	   }
	   
	   
   }
}

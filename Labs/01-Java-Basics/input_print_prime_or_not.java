package looping_statements;
import java.util.Scanner;

public class input_print_prime_or_not {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=obj.nextInt();
	   
	   int i=1;
	   int count=0;
	   
	   do {
			   int remainder =num%i;
			   if(remainder==0) {
				   count+=1;
			   }
		   i++;
	   }while(i<=num);
	   
	   
	   if(count==2) {
		   System.out.println(num + " is a Prime Number");
	   }
	   
	   else {
		   System.out.println(num + " is NOT a Prime Number");
	   }
   }
}

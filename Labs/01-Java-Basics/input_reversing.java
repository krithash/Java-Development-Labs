package looping_statements;
import java.util.Scanner;

public class input_reversing {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int num=obj.nextInt();
	   
	   int reversed=0;
	   while(num!=0) {
		   int digit=num%10;
		   reversed=(reversed*10)+digit;
		   num=num/10;
	   }
	   System.out.println("Reversed num is:"+reversed);
   }
}

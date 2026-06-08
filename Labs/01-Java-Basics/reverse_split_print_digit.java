package String_function;
import java.util.Scanner;

public class reverse_split_print_digit {
   void SplitDigit(String a) {
	   for(int i=a.length()-1;i>=0;i--) {
		   System.out.print(a.charAt(i)+" ");
	   }
   }
	
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   String no=obj.next();
	   
	   reverse_split_print_digit object=new reverse_split_print_digit();
	   object.SplitDigit(no);
   }
}

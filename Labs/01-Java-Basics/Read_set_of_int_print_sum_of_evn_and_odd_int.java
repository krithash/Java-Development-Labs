package looping_statements;
import java.util.Scanner;

public class Read_set_of_int_print_sum_of_evn_and_odd_int {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   
	   System.out.println("Enter number of times to read the int value:");
	   int no=obj.nextInt();
	   
	   int evensum=0;
	   int oddsum=0;
	   
	   for(int i=0;i<no;i++) {
		   int num=obj.nextInt();
		   
		   System.out.println("Num "+i+" is "+num);
		   if(num%2==0) {
			   evensum=evensum+num;
		   }
		   
		   else {
			   oddsum=oddsum+num;
		   }
	   }
	   
	   System.out.println("Even sum is:" +evensum);
	   System.out.println("Odd sum is:" +oddsum);
   }
}

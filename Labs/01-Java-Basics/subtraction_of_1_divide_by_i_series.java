package looping_statements;
import java.util.Scanner;

public class subtraction_of_1_divide_by_i_series {
   public static void main(String[] arg){
	   Scanner obj=new Scanner(System.in);
	   
	   System.out.println("Enter no till seq to be executed:");
	   int no=obj.nextInt();
	   double sub=1.0;
	   for(int i=2; i<no;i++) {
		   sub=sub-(1.0/i);
	   }
	   System.out.println("seq result:"+sub);
   }
}

package looping_statements;
import java.util.Scanner;

public class fibonacci_series {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the no till to be printed:");
	   int no=obj.nextInt();
	   int sum=0;
	   int n1=0;
	   int n2=1;
	   
	   System.out.println(""+n1);
	   System.out.println(""+n2);
	   for(int i=1;i<=no;i++) {
		   int n3=n2+n1;
		   n1=n2;
		   n2=n3;
		   System.out.println(""+n3);
	   }
   }
}

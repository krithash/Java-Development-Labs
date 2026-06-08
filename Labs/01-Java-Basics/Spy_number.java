package String_function;
import java.util.Scanner;

public class Spy_number {
   void spy(int a) {
	   int sum=0;
	   int product=1;
	   while(a>0) {
		   int digit=a%10;
		   sum=sum+digit;
		   product=product*digit;
		   a/=10;
	   }
	   System.out.println("Sum:"+sum);
	   System.out.println("Product:"+product);
	   if(sum==product) {
		   System.out.println("It is a spy no.");
	   }
	   else {
		   System.out.println("Not a spy no.");
	   }
   }
	
	
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int no=obj.nextInt();
	   
	   Spy_number object=new Spy_number();
	   object.spy(no);
   }
}

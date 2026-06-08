package String_function;
import java.util.Scanner;

public class Print_2_series {
   void series1(int a,int b){
	   int product;
	   for(int i=1;i<b;i++) {
		   product=i*2;
		   System.out.println(product);
	   }
	   
   }
   
   void series2(int c) {
	   int sub=c;
	   do {
		   System.out.println(sub);
		   sub-=10;
	   }while(sub>0);
}
	
   	
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the no to which sequence 1 to be printed:");
	   int no=obj.nextInt();
	   	   
	   System.out.println("Enter the no to which sequence 2 to be printed:");
	   int num=obj.nextInt();
	   
	   System.out.println("Enter the no of times seq to get executed:");
	   int till=obj.nextInt();
	   
	   Print_2_series object=new Print_2_series ();
	   object.series1(no,till);
	   object.series2(num);   
   }
}

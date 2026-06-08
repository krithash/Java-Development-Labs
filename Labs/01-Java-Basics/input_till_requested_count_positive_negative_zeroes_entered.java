package looping_statements;
import java.util.Scanner;

public class input_till_requested_count_positive_negative_zeroes_entered {
	public static void main(String[] arg) {
		   Scanner obj=new Scanner(System.in);	
		   System.out.println("Enter number of times user wants to input and check if +ve or -ve or 0:");
		   int request=obj.nextInt();
		   int pcount=0;
		   int ncount=0;
		   int zcount=0;
		   
		   do {
			   System.out.println("Enter the number:");
			   int num=obj.nextInt(); 
			   
			   if(num==0) {
				   zcount+=1;
			   }
			   
			   else if(num>=0) {
				   pcount+=1;
			   }
			   
			   else {
				   ncount+=1;
			   }
			   request--;
		   }while(request!=0);
		   
		   System.out.println("positive count:"+pcount); 
		   System.out.println("negative count:"+ncount); 
		   System.out.println("xero count:"+zcount); 
	}
}

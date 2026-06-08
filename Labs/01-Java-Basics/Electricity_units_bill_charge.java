package if_ifelse;
import java.util.Scanner;

public class Electricity_units_bill_charge {
   public static void main(String[] arg) {
	   Scanner obj= new Scanner(System.in);
	   
	   System.out.println("Enter your Name:");
	   String name=obj.nextLine();
	   
	   System.out.println("Enter units used:");
	   int unit=obj.nextInt();
	   
	   double rate=0;
	   if(unit<=100) {
		   System.out.println("Rate per unit is 1.50 rupees."); 
		   rate= rate+(unit*1.5);
	   }
	   
	   else if(unit>100 && unit<=200) {
		   System.out.println("Rate per unit is 2 rupees."); 
		   rate= rate+(unit*2);
	   }
	   
	   else if(unit>200 && unit<=300) {
		   System.out.println("Rate per unit is 3 rupees."); 
		   rate= rate+(unit*3);
	   }
	   
	   else {
		   System.out.println("Rate per unit is 5 rupees."); 
		   rate= rate+(unit*5);
	   }
	   
	   System.out.println("Rate is:"+rate);
   }
}

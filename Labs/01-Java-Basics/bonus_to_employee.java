package if_ifelse;
import java.util.Scanner;

public class bonus_to_employee {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the name:");
	   String name=obj.nextLine();
	   
	   System.out.println("Enter the salary:");
	   double salary=obj.nextDouble();
	   
	   System.out.println("Enter the % of task completed:");
	   int percent=obj.nextInt();
	   
	   int bonus=0;
	   if(percent>=90 && percent<=100) {
		   bonus=100000;
		   System.out.println("Bonus recieved:"+bonus);
	   }
	   
	   else if(percent>=80) {
		   bonus=800000;
		   System.out.println("Bonus recieved:"+bonus);
	   }
	   
	   else if(percent>=70) {
		   bonus=600000;
		   System.out.println("Bonus recieved:"+bonus);
	   }
	   
	   else if(percent>=60) {
		   bonus=400000;
		   System.out.println("Bonus recieved:"+bonus);
	   }
	   
	   else if(percent>=50) {
		   bonus=200000;
		   System.out.println("Bonus recieved:"+bonus);
	   }
	   
	   else {
		   System.out.println("No bonus");
	   }
	   
	   double NewSalary= salary+bonus;
	   System.out.println("Total Salary:"+NewSalary);
   }
}

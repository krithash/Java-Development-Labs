package if_ifelse;
import java.util.Scanner;

public class Police_work_eligible {
      public static void main(String[] arg) {
    	  Scanner obj=new Scanner(System.in);
    	  System.out.println("Enter the age:");
    	  int age=obj.nextInt();
    	  
    	  if(age>18) {
    		  System.out.println("Eligible for police work");
    	  }
    	  
    	  else {
    		  System.out.println("Not eligible for police work");
    	  }
      }
}

package if_ifelse;
import java.util.Scanner;

public class no_of_days_in_a_month {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);

	        System.out.print("Enter month (1-12): ");
	        int month = obj.nextInt();
	        
	        System.out.print("Enter year: ");
	        int year = obj.nextInt();
	        
	        int days;
	        if (month == 1) {
	            days = 31;
	        } 
	        
	        else if (month == 2) {
	            // Check leap year
	            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                days = 29;
	            } 
	            
	            else {
	                days = 28;
	            }
	        } 
	        
	        else if (month == 3) {
	            days = 31;
	        } 
	        
	        else if (month == 4) {
	            days = 30;
	        } 
	        
	        else if (month == 5) {
	            days = 31;
	        } 
	        
	        else if (month == 6) {
	            days = 30;
	        } 
	        
	        else if (month == 7) {
	            days = 31;
	        }
	        
	        else if (month == 8) {
	            days = 31;
	        }
	        
	        else if (month == 9) {
	            days = 30;
	        }
	        
	        else if (month == 10) {
	            days = 31;
	        }
	        
	        else if (month == 11) {
	            days = 30;
	        } 
	        
	        else if (month == 12) {
	            days = 31;
	        } 
	        
	        else {
	            System.out.println("Invalid month.");
	            return; // exit if invalid month
	        }

	        System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);        
   }
}

package if_ifelse;
import java.util.Scanner;

public class Season_for_month_and_day {
  public static void main(String[] arg) {
	        Scanner obj = new Scanner(System.in);

	        System.out.print("Enter month (1-12): ");
	        int month = obj.nextInt();

	        System.out.print("Enter day: ");
	        int day = obj.nextInt();
	        
	      /*
	        Spring → March 20 to June 20
	        Summer → June 21 to September 21
	        Autumn → September 22 to December 20
	        Winter → December 21 to March 19
	     */
	        
	        String season = " ";

	        if ((month == 3 && (day >= 20 && day <= 31)) ||
	            (month == 4 && (day >= 1 && day <= 30)) ||
	            (month == 5 && (day >= 1 && day <= 31)) ||
	            (month == 6 && (day >= 1 && day <= 20))) {
	            
	            season = "Spring";

	        } else if ((month == 6 && (day >= 21 && day <= 30)) ||
	                   (month == 7 && (day >= 1 && day <= 31)) ||
	                   (month == 8 && (day >= 1 && day <= 31)) ||
	                   (month == 9 && (day >= 1 && day <= 21))) {
	            
	            season = "Summer";

	        } else if ((month == 9 && (day >= 22 && day <= 30)) ||
	                   (month == 10 && (day >= 1 && day <= 31)) ||
	                   (month == 11 && (day >= 1 && day <= 30)) ||
	                   (month == 12 && (day >= 1 && day <= 20))) {
	            
	            season = "Autumn";

	        } else if ((month == 12 && (day >= 21 && day <= 31)) ||
	                   (month == 1 && (day >= 1 && day <= 31)) ||
	                   (month == 2 && (day >= 1 && day <= 29)) || // Handles leap years loosely
	                   (month == 3 && (day >= 1 && day <= 19))) {
	            
	            season = "Winter";

	        } else {
	            season = "Invalid date";
	        }

            
	        System.out.println("Season: " + season);
  }
}

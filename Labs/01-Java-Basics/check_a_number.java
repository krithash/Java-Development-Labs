package if_ifelse;
import java.util.Scanner;

public class check_a_number {
    public static void main(String[] arg) {
    	Scanner obj=new Scanner(System.in);
    	
    	System.out.println("Enter the number:");
    	int a=obj.nextInt();
    	
    	 // Check positive or negative
        if (a > 0) {
            System.out.println("Number: " + a + " is +ve.");
        } else if (a < 0) {
            System.out.println("Number: " + a + " is -ve.");
        } else {
            System.out.println("Number is zero.");
        }

        // Even or Odd
        if (a % 2 == 0) {
            System.out.println("Number: " + a + " is even.");
        } else {
            System.out.println("Number: " + a + " is odd.");
        }

        // Pass or Fail
        if (a > 40 && a < 100) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Leap year check (only if a is a valid year)
        if (a >= 0) {
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not leap year");
            }
        } else {
            System.out.println("Invalid input for leap year check");
        }
    }
}

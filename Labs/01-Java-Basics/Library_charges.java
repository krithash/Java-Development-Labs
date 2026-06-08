package if_ifelse;
import java.util.Scanner;

public class Library_charges {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int days = obj.nextInt();
        
        int charge = 0;
        
        if (days <= 5) {
            charge = days * 2;
        } else if (days <= 10) {
            charge = (5 * 2) + (days - 5) * 3;
        } else if (days <= 15) {
            charge = (5 * 2) + (5 * 3) + (days - 10) * 4;
        } else {
            charge = (5 * 2) + (5 * 3) + (5 * 4) + (days - 15) * 5;
        }
        
        System.out.println("The total library charge for " + days + " days is: Rs " + charge);
	}
}

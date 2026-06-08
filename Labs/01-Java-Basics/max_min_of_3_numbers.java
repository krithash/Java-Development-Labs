package if_ifelse;
import java.util.Scanner;

public class max_min_of_3_numbers {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 =obj.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = obj.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = obj.nextInt();

        // Find max
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Find min
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}

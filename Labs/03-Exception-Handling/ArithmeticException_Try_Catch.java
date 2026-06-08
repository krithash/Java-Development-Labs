package Exceptional_handling;
import java.util.Scanner;

public class ArithmeticException_Try_Catch {

    // Instance variable (global for the all the parts except main block)
    Scanner obj = new Scanner(System.in);  //(to access this inside main "static Scanner obj = new Scanner(System.in);)

    // Instance method to perform division
    void divide() {
        System.out.println("Enter dividend:");
        int dividend = obj.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = obj.nextInt();

        try {
            double result = dividend / divisor;
            System.out.println("Output is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    // Static main method
    public static void main(String[] args) {
        // Creating object to access non-static members
        ArithmeticException_Try_Catch object = new ArithmeticException_Try_Catch();
        object.divide(); // Now obj works properly through instance method
    }
}

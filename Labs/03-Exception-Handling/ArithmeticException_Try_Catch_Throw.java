package Exceptional_handling;
import java.util.Scanner;

public class ArithmeticException_Try_Catch_Throw {

    // Static-level Scanner object
    static Scanner obj = new Scanner(System.in);

    // Instance method to perform division
    void divide(int a, int b) {
        try {
            double c = a / b;
            System.out.println("Output is: " + c);
        } catch (ArithmeticException e) {
            // Re-throwing custom message
            throw new ArithmeticException("Can't divide by zero");
        }
    }

    public static void main(String[] arg) {
    	    System.out.println("Enter dividend:");
            int dividend = obj.nextInt();

            System.out.println("Enter the divisor:");
            int divisor = obj.nextInt();

            ArithmeticException_Try_Catch_Throw object = new ArithmeticException_Try_Catch_Throw();
            object.divide(dividend,divisor);   
    }
}

package operators;

public class Last_digit_of_a_number {
   public static void main(String[] arg) {
	   int number = 12345; 
       
       int lastDigit = number % 10;  // modulus 10 gives last digit
       
       System.out.println("Number: " + number);
       System.out.println("Last digit: " + lastDigit);
   }
}

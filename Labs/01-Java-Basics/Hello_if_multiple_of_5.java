package if_ifelse;
import java.util.Scanner;

public class Hello_if_multiple_of_5 {
    public static void main(String[] arg){
    	 Scanner obj = new Scanner(System.in);

         System.out.print("Enter a number: ");
         int number = obj.nextInt();

         if (number % 5 == 0) {
             System.out.println("Hello");
         } 
         
         else {
             System.out.println("Bye");
         }

    }
}

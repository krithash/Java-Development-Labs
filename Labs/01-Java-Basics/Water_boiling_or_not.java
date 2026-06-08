package if_ifelse;
import java.util.Scanner;

public class Water_boiling_or_not {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter temperature of water in Celsius: ");
	        float temperature = scanner.nextFloat();

	        if (temperature >= 100) {
	            System.out.println("Water is boiling.");
	        } else {
	            System.out.println("Water is not boiling.");
	        }
	 }
}

package looping_statements;
import java.util.Scanner;

public class Val_of_power_of_one_num_raised_to_another {
    public static void main(String[] arg) {
        Scanner obj= new Scanner(System.in);
        
        System.out.println("Enter the base val:");
        int base=obj.nextInt();
        
        System.out.println("Enter the power val:");
        int power=obj.nextInt();
        
        int result=1;
        int i=power;
        do {
        	result=result*base;
        	i--;
        }while(i>0);
        
        System.out.println("Result is "+result);
    }
}

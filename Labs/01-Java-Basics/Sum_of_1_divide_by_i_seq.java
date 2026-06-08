package looping_statements;
import java.util.Scanner;

public class Sum_of_1_divide_by_i_seq {
    public static void main(String[] arg) {
    	Scanner obj=new Scanner(System.in);
    	System.out.println("Enter the no till seq needs to be printed:");
    	int num=obj.nextInt();
    	double sum=0.0;
    	int i=1;
    	do {
    		sum=sum+(1.0/i);
    		System.out.println(" "+sum);
    		i++;
    	}while(i<=num);
    }
}

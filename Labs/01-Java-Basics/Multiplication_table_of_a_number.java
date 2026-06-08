package looping_statements;
import java.util.Scanner;

public class Multiplication_table_of_a_number {
     public static void main(String[] arg) {
    	 Scanner obj=new Scanner(System.in);
    	 System.out.println("Enter the number:");
    	 int num=obj.nextInt();
    	 
    	 int i=0;
    	 while(i<=10) {
    		 System.out.println(" "+num+"*"+ " "+i+"="+(num*i));
    		 i++;
    	 }
     }
}

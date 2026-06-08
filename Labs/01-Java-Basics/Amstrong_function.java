package String_function;
import java.util.Scanner;

public class Amstrong_function {
	void Amstrong_function(int a) {
		double sum=0;
		int original=a;
		while(a>0) {
			int temp=a%10;
			sum=sum+Math.pow(temp,3);
		    a=a/10;
		}
		if(sum==original) {
			System.out.println("It is an amstrong number");
		}
		else {
			System.out.println("Not an amstrong number");
		}
	}
	
    public static void main(String[] arg) {
    	Scanner obj=new Scanner(System.in);
    	
    	System.out.println("Enter the number:");
    	int no=obj.nextInt();
    	
    	Amstrong_function object=new Amstrong_function();
    	object.Amstrong_function(no);
    }
}

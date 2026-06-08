package String_function;
import java.util.Scanner;

public class Split_square_reverse_print {
	void SplitDigit(int a) {
        int temp = a;
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
	
		int arr[]=new int[digitCount];
		int i=0;
		while(a>0) {
			int digit=a%10;
			int square=digit*digit;
			a/=10;
			arr[i]=square;
			i++;
		}
		
		for(int j=0;j<digitCount;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	
	
	public static void main(String[] arg) {
		   Scanner obj=new Scanner(System.in);
		   System.out.println("Enter the number:");
		   int no=obj.nextInt();
		   
		   Split_square_reverse_print object=new Split_square_reverse_print();
		   object.SplitDigit(no);
	   }
}

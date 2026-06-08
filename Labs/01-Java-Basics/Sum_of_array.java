package Array;
import java.util.Scanner;

public class Sum_of_array {
  public static void main(String[] arg) {
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter the number of elements to be input to array:");
	  int n=obj.nextInt();
	  
	  double arr[]=new double[n];
	  for(int i=0;i<n;i++) {
		  arr[i]=obj.nextDouble();
	  }
	  
	  //sum
	  double sum=0.0;
	  for(int i=0;i<n;i++) {
		  sum+=arr[i];
	  }
	  System.out.println("Sum is "+sum);
  }
}

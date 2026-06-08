package Array;
import java.util.Scanner;

public class Copying_array_to_another {
	public static void main(String[] arg) {
		  Scanner obj=new Scanner(System.in);
		  System.out.println("Enter the number of elements to be input to array:");
		  int n=obj.nextInt();
		  
		  double arr[]=new double[n];
		  for(int i=0;i<n;i++) {
			  arr[i]=obj.nextDouble();
		  }
		  
		  System.out.println("\n");
		  System.out.println("Elements of arr 1:");
		  for(int i=0;i<n;i++) {
			  System.out.println(arr[i]);
		  }
		  
		  double copy[]=new double[n];
		  for(int i=0;i<n;i++) {
			  copy[i]=arr[i];
		  }
		  
		  System.out.println("\n");
		  System.out.println("Elements of copy arr:");
		  for(int i=0;i<n;i++) {
			  System.out.println(copy[i]);
		  }
		  
	}
}

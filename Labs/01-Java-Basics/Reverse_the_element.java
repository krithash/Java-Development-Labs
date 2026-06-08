package Array;
import java.util.Scanner;

public class Reverse_the_element {
	public static void main(String[] arg) {
		  Scanner obj = new Scanner(System.in);
	      
	      // Input for array 1
	      System.out.println("Enter number of elements to be input to an array:");
	      int n = obj.nextInt();
	      int[] arr = new int[n];
	      for(int i = 0; i < n; i++) {
	          arr[i] = obj.nextInt();
	      }
	     
	      int k=1;
	      System.out.println("Array elements at reverse order:");
	      for(int i=n-1; i>=0; i--) {
	    	  System.out.println("Element "+ k++ +" is "+arr[i]);
	      }
	}
}

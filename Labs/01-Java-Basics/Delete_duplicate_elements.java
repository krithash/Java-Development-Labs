package Array;
import java.util.Scanner;

public class Delete_duplicate_elements {
  public static void main(String[] arg) {
	  Scanner obj = new Scanner(System.in);
      
      // Input for array 1
      System.out.println("Enter number of elements to be input to an array:");
      int n = obj.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
          arr[i] = obj.nextInt();
      }
      System.out.println("Array elements before removing duplicates:");
      for(int i=0; i<n; i++) {
    	  System.out.println("Element "+i+" is "+arr[i]);
      }
      
      //deleting the duplicate elements
      for(int i=0; i<n; i++) {
    	  for(int j=0; j<n; j++) {
    		  if(i!=j && (arr[i]==arr[j]) ) {
    			 for(int k=j;k<n-1;k++){
					arr[k]=arr[k+1]; 
    			 }
    			 n--;
       		     j--;
    		  }
    	  }
      }
      
      System.out.println("Array elements after removing duplicates:");
      for(int i=0; i<n-1; i++) {
    	  System.out.println("Element "+i+" is "+arr[i]);
      }
  }
}

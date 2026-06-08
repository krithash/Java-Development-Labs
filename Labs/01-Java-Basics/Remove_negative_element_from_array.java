package Array;
import java.util.Scanner;

public class Remove_negative_element_from_array {
     public static void main(String[] arg) {
    	 Scanner obj=new Scanner(System.in);
    	 System.out.println("Enter no of inputs to an array:");
    	 int n =obj.nextInt();
    	 
    	 int arr[]=new int[n];
    	 for(int i=0;i<n;i++) {
    		 arr[i]=obj.nextInt();    	 
         }
         System.out.println("\n");
    	 
    	 for(int i=0; i<n; i++) {
    		 System.out.println("Element "+i+" is "+arr[i]);
    	 }
    	 System.out.println("\n");

    	 //finding index values of negative element in an array and modifying the array
    	 for(int i=0;i<n;i++) {
    		 if(arr[i]<0) {
    			 for(int j=i;j<n-1;j++) {
    				 arr[j]=arr[j+1];
    			 }
    			 n--;
    			 i--;
    		 }
    	 }
    	 
    	 System.out.println("\n");
         //printing array elements after removing negative element
    	 for(int i=0; i<n; i++) {
    		 System.out.println("Element "+i+" is "+arr[i]);
    	 } 
     }
}

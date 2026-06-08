package Array;
import java.util.Scanner;

public class Find_index_of_element {
     public static void main(String[] arg) {
    	 Scanner obj=new Scanner(System.in);
    	 System.out.println("Enter no of inputs to an array:");
    	 int n=obj.nextInt();
    	 
    	 int[] arr=new int[n];
    	 for(int i=0; i<n; i++) {
    		 arr[i]=obj.nextInt();
    	 }
    	 System.out.println("\n");
    	 
    	 for(int i=0; i<n; i++) {
    		 System.out.println("Element "+i+" is "+arr[i]);
    	 }
    	 System.out.println("\n");
    	 
    	 System.out.println("Enter the element to find its index:");
    	 int no=obj.nextInt();
    	 
    	 for(int i=0; i<n; i++) {
    		 if(arr[i]==no) {
    			 System.out.println("Index of "+no+" is "+i);
    			 break;
    		 }
    	 }
     }
}

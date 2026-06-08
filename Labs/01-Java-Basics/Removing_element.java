package Array;
import java.util.Scanner;

public class Removing_element {
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
    	 
    	 System.out.println("Enter the element to be removed:");
    	 int element=obj.nextInt();
    	 int IndexToBeDeleted=0;
    	 
    	 //finding index position of the element
    	 for(int i=0; i<n; i++) {
    		 if(arr[i]==element) {
    			 System.out.println("Index of "+element+" is "+i);
    			 IndexToBeDeleted+=i;
    			 break;
    		 }
    	 }
    	 
    	 //removing element using index position of it
    	 for(int i=IndexToBeDeleted;i<n-1;i++) {
    		 arr[i]=arr[i+1];
    	 }
    	 
         System.out.println("\n");
         //printing array elements after removing	 
    	 for(int i=0; i<n-1; i++) {
    		 System.out.println("Element "+i+" is "+arr[i]);
    	 }
     }
}

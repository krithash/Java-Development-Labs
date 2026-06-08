package Array;
import java.util.Scanner;

public class Combine_of_2_array {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
       System.out.println("Enter no of inputs for array 1:");
       int n =obj.nextInt();
       
       System.out.println("Enter input to array 1:");
       int arr1[]=new int[n];
       for(int i=0;i<n;i++) {
    	  arr1[i]=obj.nextInt();    	 
       }
       System.out.println("\n");
    	 
       for(int i=0; i<n; i++) {
    	  System.out.println("Element "+i+" is "+arr1[i]);
       }
       System.out.println("\n");
       
       System.out.println("Enter no of inputs for array 2:");
       int m =obj.nextInt();
       System.out.println("\n");
       System.out.println("Enter input to array 2:");
       int arr2[]=new int[m];
       for(int i=0;i<m;i++) {
    	  arr2[i]=obj.nextInt();    	 
       }
       System.out.println("\n");
    	 
       for(int i=0; i<m; i++) {
    	  System.out.println("Element "+i+" is "+arr2[i]);
       }
       
       int CombinedCount=n+m;
       int combined[]= new int[CombinedCount];
       for(int i=0; i<CombinedCount; i++) {
    	   if(i<n) {
    		   combined[i]=arr1[i];
    	   }
    	   
    	   else {
    		   combined[i]=arr2[i-n];
    	   }
       }
       
       System.out.println("\n");
       System.out.println("Elements of combined array are:");
  	   for(int i=0; i<CombinedCount; i++) {
   		  System.out.println("Element "+i+" is "+combined[i]);
   	   }
   }
}

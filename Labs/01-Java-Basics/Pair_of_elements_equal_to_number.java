package Array;
import java.util.Scanner;

public class Pair_of_elements_equal_to_number {
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
        
     	System.out.println("Enter the num for which pair is required: ");
     	int num=obj.nextInt();
     	
     	for(int i=0;i<n;i++) {
     		for(int j=0;j<n;j++) {
     			if(num==arr[i]+arr[j]) {
     				System.out.println("Pair is "+arr[i]+" and "+arr[j]);
     			}
     		}
     	}
     }
}

package Array;
import java.util.Scanner;

public class Common_elements_btw_2_array {
	 public static void main(String[] arg) {
		  Scanner obj=new Scanner(System.in);
		  System.out.println("Enter the number of elements to be input to array:");
		  int n=obj.nextInt();
		  
		  double arr1[]=new double[n];
		  for(int i=0;i<n;i++) {
			  arr1[i]=obj.nextDouble();
		  }
		  
		  System.out.println("\n");
		  System.out.println("Elements of arr 1:");
		  for(int i=0;i<n;i++) {
			  System.out.println(arr1[i]);
		  }
		  
		  double arr2[]=new double[n];
		  for(int i=0;i<n;i++) {
			  arr2[i]=obj.nextDouble();
		  }
		  
		  System.out.println("\n");
		  
		  System.out.println("Elements of arr 2:");
		  for(int i=0;i<n;i++) {
			  System.out.println(arr2[i]);
		  }
		  
		  System.out.println("\n");
		  
		  int common=0;
		  for(int i=0; i<n; i++) {
			  for(int j=0; j<n; j++) {
				  if(arr1[i]==arr2[j]) {
					  common+=1;
					  System.out.println(arr1[i]);
				  }
			  }
		  }
		  System.out.println("common no of elements:" +common);
     }
}

package Array;
import java.util.Scanner;

public class Max_min_element {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   
	   System.out.println("Enter the no of elements to be input to the array:");
	   int n=obj.nextInt();
	   double arr[]=new double[n];
	   
	   for(int i=0; i<n; i++) {
		   arr[i]=obj.nextDouble();
	   }
	   
	   double max=arr[0];
	   double min=arr[0];
	   
	   int i=1;
	   while(i<n) {
		   if(arr[i]>max) {
			   max=arr[i];
		   }
		   
		   if(arr[i]<min) {
			   min=arr[i];
		   }
		   i++;
	   }
	   System.out.println("Max no is:"+max);
	   System.out.println("Min no is:"+min);
   }
}

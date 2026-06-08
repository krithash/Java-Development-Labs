package Array;
import java.util.Scanner;

public class Sec_largest_in_array {
  public static void main(String[] arg){
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter the number of elements to be input to array:");
	  int n=obj.nextInt();
	  
	  double arr[]=new double[n];
	  for(int i=0;i<n;i++) {
		  arr[i]=obj.nextDouble();
	  }
	  
	  //sorting the array
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<n-i-1;j++) {
			  if(arr[j]>arr[j+1]) {
				  double temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
	  }
	  
	  for(int i=0;i<n;i++) {
		  System.out.println("Element "+i+" is: "+arr[i]);
	  }
	  
	  System.out.println("Second largest number is "+arr[n-2]);
  }
}

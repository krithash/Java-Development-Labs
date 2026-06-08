package Array;
import java.util.Scanner;

public class Even_odd_count {
	 public static void main(String[] arg) {
		  Scanner obj=new Scanner(System.in);
		  System.out.println("Enter the number of elements to be input to array:");
		  int n=obj.nextInt();
		  
		  double arr[]=new double[n];
		  for(int i=0;i<n;i++) {
			  arr[i]=obj.nextInt();
		  }
		  
		  int ocount=0;
		  int ecount=0;
		  for(int i=0;i<n;i++) {
			  if(arr[i]%2==0) {
				  ecount+=1;
			  }
			  else {
				  ocount+=1;
			  }
		  }
		  
		  System.out.println("Even count:"+ecount);
		  System.out.println("Odd count:"+ocount);
	 }
}

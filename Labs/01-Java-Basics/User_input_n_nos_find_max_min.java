package looping_statements;
import java.util.Scanner;

public class User_input_n_nos_find_max_min {
  public static void main(String[] arg) {
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Enter no of inputs:");
	  int no=obj.nextInt();
	  
	  System.out.println("The first input:");
	  double num=obj.nextDouble();
	  double max=num;
	  double min=num;
	  
	  System.out.println("The remaining inputs are:");
	  for (int i=1;i<no;i++) {
		  num=obj.nextDouble();
		  if(num>max) {
			  max=num;
		  }
		  
		  if(num<min) {
			  min=num;
		  }
	  }
	  System.out.println("Max no:"+max);
	  System.out.println("Min no:"+min);
  }
}

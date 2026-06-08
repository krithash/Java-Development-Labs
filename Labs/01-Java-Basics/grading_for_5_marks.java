package if_ifelse;
import java.util.Scanner;

public class grading_for_5_marks {
  public static void main(String[] arg) {
	  Scanner obj= new Scanner(System.in);
	  
	  System.out.println("Enter the marks:");
	  
	  System.out.println("Enter the mark 1:");
	  float mark1=obj.nextFloat();
	  
	  System.out.println("Enter the mark 2:");
	  float mark2=obj.nextFloat();
	  
	  System.out.println("Enter the mark 3:");
	  float mark3=obj.nextFloat();
	  
	  System.out.println("Enter the mark 4:");
	  float mark4=obj.nextFloat();
	  
	  System.out.println("Enter the mark 5:");
	  float mark5=obj.nextFloat();
	  
	  System.out.println("mark 1:" +mark1);
	  System.out.println("mark 2:" +mark2);
	  System.out.println("mark 3:" +mark3);
	  System.out.println("mark 4:" +mark4);
	  System.out.println("mark 5:" +mark5);
	  
	  float average=(mark1+mark2+mark3+mark4+mark5)/5;
	 String grade;
	  
	  if(average>=95 && average<=100) {
		  grade="O";
	  }
	  
	  else if(average>90) {
		  grade="A+";
	  }
	  
	  else if(average>80){
		  grade="A";
	  }
	  
	  else if(average>70) {
		  grade="B+";
	  }
	  
	  else if(average>60){
		  grade="B";
	  }
	  
	  else if(average>50){
		  grade="c";
	  }
	  
	  else if(average>40){
		  grade="P";
	  }
	  
	  else {
		  grade="F";
	  }
	  
	  System.out.println("Grade: " + grade);
	  
  }
}

package String_function;
import java.util.Scanner;

public class count_of_char_in_string {
   public static void main(String[] arg) {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the string:");
	   String name=obj.next(); //input a word
	   
	   System.out.println("Enter the same word to print each letters count of occurence:");
	   String character=obj.next(); //input should be same word only
	   
	   for(int i=0; i<name.length(); i++) {
		   int count=0;
		   for (int j=0; j<character.length(); j++) {
			   if(name.charAt(i)==character.charAt(j)) {
				   count+=1;
			   }
		   }
		   System.out.println("count of "+name.charAt(i)+" is "+count);
	   }
   }
}

package if_ifelse;
import java.util.Scanner;

public class check_vowels_consonants {
  public static void main(String[] arg) {
	  Scanner obj= new Scanner(System.in);
	  
	  System.out.println("Enter a character:");
	  char character= obj.next().charAt(0);
	  
  
  
  if(character=='a' || character=='e' || character=='i' || character=='o' ||character=='u' || character=='A' 
		   || character=='E' || character=='I' || character=='O' || character=='U'  ){
	  
	  System.out.println(character + " is a vowel.");
  }
  
  else {
	  System.out.println(character + " is a consonant.");
  }
 }
}
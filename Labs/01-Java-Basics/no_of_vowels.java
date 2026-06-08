package String_function;
import java.util.Scanner;

public class no_of_vowels {
    public static void main(String[] arg) {
    	Scanner obj=new Scanner(System.in);
    	
    	System.out.println("Enter the string:");
    	String name=obj.next();
    	name=name.toLowerCase();
    	
    	int VowelCount=0;
    	for(int i=0; i<name.length();i++) {
    		if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' 
    				|| name.charAt(i)=='u') {
    			VowelCount+=1;
    			System.out.println("Vowel is "+name.charAt(i));
    		}
    	}
    	System.out.println("Total number of vowels are:"+VowelCount);
    }
}

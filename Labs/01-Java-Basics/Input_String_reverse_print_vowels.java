package String_function;
import java.util.Scanner;

public class Input_String_reverse_print_vowels {
	
   void reverse(String a){
	    String word=" ";
	    for (int i=a.length()-1;i>=0;i--) {
	    	char ch= a.charAt(i);
	    	if(ch!=' ') {
	    		word =word+ch;
	    	}
	    	
	    	else {
	    		System.out.println(word);
	    		word=" ";
	    	}
	    }
}
   
    void vowels(String b) {
    	for(int i=b.length()-1;i>0;i--) {
    		char ch= b.charAt(i);
    		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
    			System.out.println("Vowel is:"+ch);
    		}
    	}
    }
	
    public static void main(String[] arg) {
	   Scanner obj = new Scanner(System.in);
       System.out.println("Enter the sentence:");
       String sentence = obj.nextLine();
       
       Input_String_reverse_print_vowels object=new Input_String_reverse_print_vowels();
       object.reverse(sentence);
       object.vowels(sentence);
   }
}

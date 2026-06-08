package String_function;
import java.util.Scanner;

public class No_of_char_in_longest_word_of_sentence {
   static int No_of_char(String b) {
	   return b.length();
   }
   
   static void longest_word(String a) {
	   int count=0;
	   int wcount=0;
	   String word=" ";
	   a=a+" ";
	   int k=0;
	   
	   //word count
	   for(int i=0; i<a.length(); i++) {
		   char ch=a.charAt(i);
		   if(ch==' ') {
			   wcount+=1;
		   }
	   }
	   System.out.println("No of words in sentence are "+wcount);
	   System.out.println("\n");
	   
	   int[] lwcount=new int[wcount];
	   String longestword="";
	   int maxlen=0;
	   
	   //letter count for each word
	   for(int i=0; i<a.length(); i++) {
		   char ch=a.charAt(i);
		   if(ch==' ') {
			   System.out.println("Word "+word+" has "+count+" letters.");
			   lwcount[k]=count;
               k++;
               
               if(count>maxlen) {
            	   maxlen=count;
            	   longestword=word;
               }
               count=0;
               word="";
		   }
		   else {
			   word+=ch;
			   count+=1;  
		   }
	   }
	   
	   for(int i=0; i<lwcount.length;i++) {
		   System.out.println(lwcount[i]);
	   }
	   System.out.println("\n");
	   System.out.println("No of characters in long word is "+ No_of_char(longestword));
   }
	
   public static void main(String[] arg) {
	   Scanner obj = new Scanner(System.in);
       System.out.println("Enter the sentence:");
       String sentence = obj.nextLine();
       
       longest_word(sentence);  
   }
}

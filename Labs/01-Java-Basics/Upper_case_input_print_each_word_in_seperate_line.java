package String_function;
import java.util.Scanner;

public class Upper_case_input_print_each_word_in_seperate_line {
    public static void main(String[] arg) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = obj.nextLine();
        sentence = sentence.toUpperCase();
        System.out.println("String in upper case is: " + sentence);

        String word = "";
        sentence = sentence + " ";  // Add space to capture last word

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } 
            
            else {
                System.out.println(word);
                word = "";  
                }
            }
        }
    }


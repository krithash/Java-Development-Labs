package operators;

public class Swapping {
   public static void main(String[] arg) {
	   int a =10;
	   int b =7;
	   System.out.println("Val1:" +a);
	   System.out.println("Val2:" +b);
	   
	   int c=a;
	   a = b;      
       b = c; 
	   
	  
	   System.out.println("Swapped values:");
	   System.out.println("Val1:" +a+ ", Val2:" +b);
	   
   }
}

package operators;

public class Distributive_law {
   public static void main(String[] arg) {
	   int a = 3;
	   int b = 7;
	   int c = 5;
	   
	   int d= (a+b)*c;
	   int e= (a*c)+(b*c);
	   
	   System.out.println("Val 1:" +a);
	   System.out.println("Val 2:" +b);
	   System.out.println("Val 3:" +c);
	   
	   System.out.println("LHS :" +d);
	   System.out.println("RHS :" +e);
   }
}

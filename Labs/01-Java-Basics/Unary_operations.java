package operators;

public class Unary_operations {
     public static void main(String[] arg) {
    	 int a= 5;
    	 boolean h = false;
    	 System.out.println("Val :" +a);
    	 System.out.println("Val :" +h);
    	 
    	 int b=+a;
    	 int c=-a;
    	 int d=++a;
    	 int e=--a;
    	 boolean f=!h;
    	 int g=~a;
    	 int i =a++;
    	 int j =a--;
    	 
    	 System.out.println("Unary Plus:" +b);
    	 System.out.println("Unary Minus:" +c);
    	 System.out.println("Pre Increment:" +d);
    	 System.out.println("Pre Decrement:" +e);
    	 System.out.println("Post Increment:" +i);
    	 System.out.println("Post Decrement:" +j);
    	 System.out.println("Logical NOT:" +f);
    	 System.out.println("Bitwise Complement:" +g);
     }
}

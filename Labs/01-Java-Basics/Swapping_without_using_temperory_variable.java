package operators2;

public class Swapping_without_using_temperory_variable {
   public static void main(String[] arg) {
	   int a =5;
	   int b =3 ;
	   
	   System.out.println("Before swapping: a = " + a + ", b = " + b);
	   
	   a= a+b;
	   b= a-b;
	   a= a-b;

	   System.out.println("After swapping: a = " + a + ", b = " + b);
   }
}

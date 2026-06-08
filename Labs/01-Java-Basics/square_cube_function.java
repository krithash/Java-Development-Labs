package String_function;
import java.util.Scanner;

public class square_cube_function {
	
	int square(int a) {
		int square =a*a;
		return square;
	}
	
	int cube(int a) {
		int cube =a*a*a;
		return cube;
	}
    public static void main(String[] arg) {
    	Scanner obj=new Scanner(System.in);
    	System.out.println("Enter the no:");
    	int no =obj.nextInt();
    	
    	square_cube_function object=new square_cube_function();
    	System.out.println("Square value is:"+object.square(no));
    	System.out.println("cube value is:"+object.cube(no));
    }
}

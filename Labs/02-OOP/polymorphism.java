package Oops;

class shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	
	//method overloading
	void draw(String shape) {
		System.out.println("Drawing "+shape);
	}
}

class circle extends shape{
	//method overriding
	@Override  //can be mentioned for compilers clarity. Even if this is not there code works(overriding). 
	void draw(){
		System.out.println("Drawing circle");
	}
}

public class polymorphism {
   public static void main(String[] arg) {
	   circle c =new circle();
	   c.draw();
	   
	   shape s=new shape();
	   s.draw("Triangle");
   }
}

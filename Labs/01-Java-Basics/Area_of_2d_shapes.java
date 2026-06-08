package operators2;

public class Area_of_2d_shapes {
   public static void main(String[] arg) {
    float height = 5;
    float side = 7;
    float base = 6;
    float radius = 9;
    
    System.out.println("side:" +side);
    System.out.println("Area of square:" + (side*side));
    
    System.out.println("radius:" +radius);
    System.out.println("Area of circle:" + ((3.14)*(Math.pow(radius, 2))));
    
    System.out.println("base:" +base);
    System.out.println("height:" +height);
    System.out.println("Area of triangle:" + (0.5)*base*height);
   }
   
}

package operators2;

public class CI {
    public static void main(String[] args) {
        double principal = 10000.0;  
        int n=5;       //no of times amount compounded
        double rate = 5.0;           
        double time = 2.0;           
        double compound_interest = ((principal)*(Math.pow(1+(rate/(n*100)),n*time))) - principal;

       
        System.out.println("Principal = Rs. " + principal);
        System.out.println("Rate of Interest = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("No of times amount compounded = " + n + " times");
        System.out.println("Simple Interest = Rs. " + compound_interest);
        }
}
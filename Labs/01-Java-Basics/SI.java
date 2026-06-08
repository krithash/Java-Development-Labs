package operators2;

public class SI {
	    public static void main(String[] args) {
	        double principal = 10000.0;  
	        double rate = 5.0;           
	        double time = 2.0;           
	        double interest = (principal * rate * time) / 100;

	       
	        System.out.println("Principal = Rs. " + principal);
	        System.out.println("Rate of Interest = " + rate + "%");
	        System.out.println("Time = " + time + " years");
	        System.out.println("Simple Interest = Rs. " + interest);
	    }
}



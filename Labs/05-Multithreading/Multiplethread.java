package connection;

class evenprinter extends Thread{        //1st method to call thread using extend
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddPrinter implements Runnable {  //2nd method to call thread using implement
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Multiplethread {
    public static void main(String[] args) throws InterruptedException {
        evenprinter even = new evenprinter();
        OddPrinter odd = new OddPrinter(); // Create a new instance of MyRunnable
        Thread t = new Thread(odd);   // Create a new thread and assign the Runnable to it
        
        even.start(); 
        even.join(); // wait for even numbers to finish
        
        t.start(); // Start the thread; this will execute obj.run() in parallel
    }
}

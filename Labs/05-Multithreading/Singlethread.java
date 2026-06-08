package connection;

class MyTask extends Thread {
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }
    }
}

public class Singlethread {
	  public static void main(String[] args) {
	        MyTask task = new MyTask();
	        task.start();
	    }
}

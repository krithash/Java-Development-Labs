package connection;

class backgroundservice extends Thread{
     public void run() {
    	 while(true) {
    		 System.out.println("Background task running....");
    		 
    		 try {
    			 Thread.sleep(500);
    		 }
    		 
    		 catch(InterruptedException e) {
    			 
    		 }
    	 }
     }
}

public class Daemonthread {
   public static void main(String[] arg) throws InterruptedException{
	   backgroundservice bg=new backgroundservice();
	   bg.setDaemon(true);
	   bg.start();
	   
	   Thread.sleep(2000);
       System.out.println("Main Thread finished");
   }
}

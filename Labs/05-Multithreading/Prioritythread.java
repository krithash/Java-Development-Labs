package connection;

class prioritytask extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"with priority"+Thread.currentThread().getPriority());
	}
}
public class Prioritythread {
   public static void main(String[] arg) {
	   prioritytask t1=new prioritytask();
	   prioritytask t2=new prioritytask();
	   prioritytask t3=new prioritytask();
       
	   t1.setPriority(Thread.MIN_PRIORITY);
	   t2.setPriority(Thread.NORM_PRIORITY);
	   t3.setPriority(Thread.MAX_PRIORITY);
	   
	   t1.start();
	   t2.start();
	   t3.start();
   }
}

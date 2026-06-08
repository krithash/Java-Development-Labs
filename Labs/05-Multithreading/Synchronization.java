package connection;

class mouse{
	synchronized void click(int n) {
		for(int i=0; i<5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}

class mouse1 extends Thread{
    mouse t;                // field to hold reference to shared mouse
    mouse1(mouse t) {       // constructor receives the shared mouse
        this.t = t;         // store reference so run() can use it
    }
    public void run() {
        t.click(4);         // calls click on the shared mouse
    }
}

class mouse2 extends Thread{
    mouse t;                // field to hold reference to shared mouse
    mouse2(mouse t) {       // constructor receives the shared mouse
        this.t = t;         // store reference so run() can use it
    }
    public void run() {
        t.click(5);         // calls click on the shared mouse
    }
}

public class Synchronization {
	public static void main(String[] args) {
        mouse o = new mouse();        // ONE shared mouse object
        mouse1 o1 = new mouse1(o);    // thread1 gets reference to same mouse
        mouse2 o2 = new mouse2(o);    // thread2 gets reference to same mouse
        o1.start();
        o2.start();
    }
}

//Two thread objects (mouse1 and mouse2) are created.
//Both threads hold a reference to the SAME shared mouse object.
//Because the synchronized method uses the object's lock,
//only one thread can execute click() at a time.

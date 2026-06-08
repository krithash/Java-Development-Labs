package connection;

class A{
	
}

class B{
	@Override
	protected void finalize(){
		System.out.println("Object of B is being garbage collected");
	}
}
public class Garbagecollector {
	public static void main(String[] args) {
        new A(); // Will be destroyed silently
        new B(); // Will print message when destroyed

        System.gc(); // Ask JVM to run Garbage Collector
    }
}


//Case 1: Class A (no finalize() written)

//GC still destroys the object of A.

//But since no finalize() is defined, it does it silently (no message).

//Case 2: Class B (overrides finalize())

//GC destroys the object of B too.

//But before destroying, it calls finalize().

//That’s why you see the message “Object of B is being garbage collected”.


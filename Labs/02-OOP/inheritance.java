package Oops;

class animal{    //super class
	void eat() {
		System.out.println("Eating...");
	}
}

//single inheritance--> one super-one base class
class dog extends animal{   //base1
	void bark() {
		System.out.println("Barking...");
	}
}

//multi level inheritance--> super class-base1-base2-base3.....
class puppy extends dog{   //base2
	void weep() {
		System.out.println("Weeping...");
	}
}

//hierarchial inheritance--> super-base1  ; super-base2;  super-base3....
class cat extends animal{  //base 3
	void meow() {
		System.out.println("Meowing...");
	}
}

interface flyable{   //super3
	void fly();
}

interface soundable{  //super4
    void makesound();
}

//multiple inheritance- multiple super classes connected to one base class using interface
//super3-base5, super4-base5
class bat implements flyable,soundable{ //base 5
	@Override   //can be mentioned for compilers clarity but works even if not there
	public void fly() {
		 System.out.println("Bat is flying...");
	}
	
	//even makesound function is overriding function
	public void makesound() {
		 System.out.println("Bat is screeching...");
	}
}

//hybrid inheritance -combination of other inheritance methods into one code
//here it is combination of  Single Inheritance (class) + Multiple Inheritance (interface)
class bird extends animal implements flyable{
	 public void fly() {
	        System.out.println("Bat is flying...");
	    }

	    public void makeSound() {
	        System.out.println("Bat is screeching...");
	    }
}

public class inheritance {
   public static void main(String[] arg) {
	   System.out.println("--- Single Inheritance ---");
       dog dog = new dog();
       dog.eat();   // from Animal
       dog.bark();  // from Dog

       System.out.println("\n--- Multilevel Inheritance ---");
       puppy p = new puppy();
       p.eat();    // from Animal
       p.bark();   // from Dog
       p.weep();   // from Puppy

       System.out.println("\n--- Hierarchical Inheritance ---");
       cat c = new cat();
       c.eat();    // from Animal
       c.meow();   // from Cat

       System.out.println("\n--- Hybrid Inheritance (Class + Interface) ---");
       bird b = new bird();
       b.eat();    // from Animal
       b.fly();    // from Flyable

       System.out.println("\n--- Multiple Inheritance (Interfaces) ---");
       bat bat = new bat();
       bat.fly();         // from Flyable
       bat.makesound();   // from Soundable
   }
}

package Oops;

class student{
   String name;
   int age;
   
   //default constructor
   student(){
	   name="kithu";
	   age=20;
   }
   
   //parameterized constructor 
   student(String name, int age){
	   this.name=name;
	   this.age=age;
   }
   
   //copy constructor
   student(student s){
	   this.name=s.name;
	   this.age=s.age;
   }
   
   void display() {
	   System.out.println("Name: "+name+" Age: "+age);
   }
   
   //Java does not differentiate constructors by parameter names — only by type and order
   //boolean dummy is an extra dummy parameter .If it is not there error occurs as duplicate constructor.
   //dummy parameter added to differentiate between actual and private constructor
   private student(String n, int a, boolean dummy) {   
	   name=n;                        
	   age=a;                         
   }
   
   //object created and called within the class itself as it is a private constructor.
   //this code has two main methods. one inside student class and another inside constructor class.
   //if right click inside student class --> run as --> java application -->student main. output: Name: ammu Age: 20
   public static void main(String[] arg) {
	   student s4=new student("ammu",20); 
	   s4.display();
   }
}

public class constructor {
  public static void main(String arg[]) {
	  student s1=new student();
	  student s2=new student("harshu",20);
	  student s3=new student(s2);
	  s1.display();
	  s2.display();
	  s3.display();
  }
}

package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Department implements Serializable {
    private static final long serialVersionUID = 2L;
    String name;

    Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

//Employee as a top-level (package-private) class
class Employee implements Serializable {
 private static final long serialVersionUID = 1L;

 String name;
 int id;
 transient String password;       // will NOT be serialized automatically
 static String company = "Acme";  // static fields are not serialized
 Department dept;                 // nested object (object graph)

 Employee(String n, int i, String p, Department d) {
     name = n;
     id = i;
     password = p;
     dept = d;
 }

 @Override
 public String toString() {
     return name + " (id=" + id + "), pwd=" + password +
            ", dept=" + dept + ", company=" + company;
 }
}

public class Serial_Deserial2 {
	public static void main(String[] args) {
        String file = "D:\\JAVA\\programs\\practice on serialization and deserialization\\employee_no_custom.ser";

        Department d = new Department("R&D");
        Employee emp = new Employee("Yoga", 100, "pass123", d);

        System.out.println("Before serialization -> " + emp);

        // Serialize (transient password will NOT be saved)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(emp);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Change static to show static is not serialized with the object
        Employee.company = "Globex";

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Employee e2 = (Employee) ois.readObject();
            System.out.println("After deserialization -> " + e2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

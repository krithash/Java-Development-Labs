package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//instead of individually importing we can also use import java.io.*;

// This program demonstrates serialization and deserialization in Java.
// Serialization = converting an object into a byte stream (to store in a file or send over network).
// Deserialization = reconstructing the object back from the byte stream.

public class Serial_Deserial {

    // Department class is Serializable, meaning its objects can be written to a stream.
    static class Department implements Serializable {
        // serialVersionUID is used to ensure class compatibility during deserialization.
        // If this changes, old serialized objects may not deserialize correctly.
        private static final long serialVersionUID = 2L;
        String name;

        Department(String name) {
            this.name = name;
        }

        // When we print Department object, it will display its name.
        public String toString() {
            return name;
        }
    }

    // Employee class is Serializable as well.
    static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        String name;                // normal instance variable → will be serialized
        int id;                     // normal instance variable → will be serialized
        transient String password;  // transient → skipped by default serialization
        static String company = "Acme"; // static → belongs to class, never serialized
        Department dept;            // nested object → serialized because Department implements Serializable

        Employee(String n, int i, String p, Department d) {
            name = n;
            id = i;
            password = p;
            dept = d;
        }

        // Custom serialization method
        private void writeObject(ObjectOutputStream out) throws IOException {
            // 🔹 defaultWriteObject() → performs "normal" serialization
            // i.e., it serializes all non-static, non-transient fields (name, id, dept).
            // Normally, when we call oos.writeObject(emp), JVM internally does this for us.
            // But since we override writeObject(), we must explicitly call it to keep default behavior.
            out.defaultWriteObject();

            // 🔹 Then we add custom logic: password is transient, so it's not saved automatically.
            // We manually write it as UTF string. If it's null, write empty string.
            out.writeUTF(password == null ? "" : password);
        }

        // Custom deserialization method
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            // 🔹 defaultReadObject() → restores the fields serialized by defaultWriteObject()
            in.defaultReadObject();

            // 🔹 Then restore password manually
            String pw = in.readUTF();
            password = pw.isEmpty() ? null : pw;
        }

        // Print employee details
        public String toString() {
            return name + " (id=" + id + "), pwd=" + password +
                   ", dept=" + dept + ", company=" + company;
        }
    }

    public static void main(String[] arg) throws IOException, ClassNotFoundException {
    	String file = "D:\\JAVA\\programs\\practice on serialization and deserialization\\simple_emp.ser";
 // file where object will be saved

        // Create Department and Employee objects
        Department d = new Department("R&D");
        Employee emp = new Employee("Yoga", 100, "pass123", d);

        // 🔹 SERIALIZATION: Write object to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(emp);  // writes emp object → calls Employee.writeObject() internally
        }

        // Change static field after serialization
        // Note: static fields are never serialized. They take current value from class at runtime.
        Employee.company = "Globex";

        // 🔹 DESERIALIZATION: Read object back from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Employee e2 = (Employee) ois.readObject(); // reads object → calls Employee.readObject()
            System.out.println("Deserialized -> " + e2);
        }

        // Expected output:
        // Deserialized -> Yoga (id=100), pwd=pass123, dept=R&D, company=Globex
        // Note: company shows "Globex" (the latest static value, not the serialized one)
    }
}

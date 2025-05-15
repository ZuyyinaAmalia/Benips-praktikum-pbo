/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg9;
import java.io.*;
class Person implements Serializable {
    private String name;
    public Person(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Serialized person name = "+ person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}

import java.io.*;

/**
 * File : SerializablePerson.java
 * Deskripsi : Program untuk menyerialisasi objek Person ke dalam sebuah file
 */
public class SerializablePerson {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

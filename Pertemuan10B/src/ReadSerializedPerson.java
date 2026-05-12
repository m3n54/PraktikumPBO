import java.io.*;

/**
 * File : ReadSerializedPerson.java
 * Deskripsi : Program untuk membaca objek Person dari file yang telah diserialisasi
 */
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            person = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Read person name: " + person.getName());
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.printStackTrace();
        }
    }
}

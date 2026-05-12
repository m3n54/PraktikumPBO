import java.io.Serializable;

/**
 * File : Person.java
 * Deskripsi : Person POJO yang dapat diserialisasi
 */
public class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

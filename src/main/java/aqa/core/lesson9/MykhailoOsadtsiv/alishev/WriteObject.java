package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/aqa/core/lesson9/MykhailoOsadtsiv/Resources/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

        }  catch (IOException e) {
            System.out.println("File not Found");
        }
    }
}

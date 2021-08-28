package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class WriteObject {
    public static void main(String[] args) {
       //1 Person person1 = new Person(1, "Bob");
       //1 Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/aqa/core/lesson9/MykhailoOsadtsiv/Resources/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

      //1      oos.writeObject(person1);
      //1      oos.writeObject(person2);
            oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }

            oos.close();

        }  catch (IOException e) {
            System.out.println("File not Found");
        }
    }
}

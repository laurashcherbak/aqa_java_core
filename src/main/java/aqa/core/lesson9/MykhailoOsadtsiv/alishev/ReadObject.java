package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/aqa/core/lesson9/MykhailoOsadtsiv/Resources/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //1   Person person3 = (Person) ois.readObject();
            //1  Person person4 = (Person) ois.readObject();

            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people));


    //1        System.out.println(person3);
    //1       System.out.println(person4);

            ois.close();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

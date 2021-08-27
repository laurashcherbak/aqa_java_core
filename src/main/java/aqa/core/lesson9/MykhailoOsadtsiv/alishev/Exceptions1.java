package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
   /*     File file = new File("src/main/java/aqa/core/lesson9/MykhailoOsadtsiv/Resources/Test.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }

        System.out.println("Program work farther"); */
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception workout in main method");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("src/main/java/aqa/core/lesson9/MykhailoOsadtsiv/Resources/asdf.txt");
        Scanner scanner = new Scanner(file);
    }
}

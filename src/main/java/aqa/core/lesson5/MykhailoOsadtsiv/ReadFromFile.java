package aqa.core.lesson5.MykhailoOsadtsiv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
      //  String separator = File.separator;
      //  String path = //to long
      //  File file = new File (path);
        File file = new File("D:\\Coding\\Projects\\aqa_java_core\\src\\main\\java\\aqa\\core\\lesson5\\MykhailoOsadtsiv\\test.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

    }
}

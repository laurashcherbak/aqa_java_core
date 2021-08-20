package aqa.core.lesson5.MykhailoOsadtsiv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereader {
    public static void main(String[] args) throws FileNotFoundException {
    //   String separator = File.separator;
    //   String path = "D:" + separator + "Coding" + separator + "Projects"
    //           + separator + "GlobalLogicBaseCamp" + separator + "files" + separator + "test.txt";

        String path = "D:\\Coding\\Projects\\aqa_java_core\\src\\main\\java\\aqa\\core\\lesson5\\MykhailoOsadtsiv\\test.txt";
        File file = new File(path);
        System.out.println(file);
       // System.out.println(System.getProperty("user.dir"));

           Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
         scanner.close();


        }


}

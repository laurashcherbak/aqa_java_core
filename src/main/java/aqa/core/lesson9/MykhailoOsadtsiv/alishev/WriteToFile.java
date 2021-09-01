package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/aqa/core/lesson9/MykhailoOsadtsiv/Resources/TestFile.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("1\n2\n3");
        pw.close();
    }
}

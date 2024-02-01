package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteText {
    public static void main(String[] args) throws IOException {

        File file = new File("Hello.txt");

        Scanner kb = new Scanner(System.in);
        System.out.println("Please write text in file:");
        String txt = kb.nextLine();

        FileWriter w = new FileWriter(file, true);
        w.write(txt);
        w.close();
        System.out.println("File closed Successfully");

    }
}

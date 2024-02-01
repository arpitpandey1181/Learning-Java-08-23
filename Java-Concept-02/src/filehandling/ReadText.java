package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {

        File file = new File("FirstCode.py");

        try {
            if (file.createNewFile()) {
                System.out.println("File Created Successfully!");
            } else {
                System.out.println("File Alredy Present");
            }

            Scanner kb = new Scanner(file);

            while (kb.hasNextLine()) {
                String txt = kb.nextLine();
                System.out.println(txt);
            }
            System.out.println("Reading Done!");

        } catch (IOException e) {
            System.out.println("Error Occured!");
            e.printStackTrace();
        }

    }
}

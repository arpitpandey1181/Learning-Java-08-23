package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Tester01 {
    public static void main(String[] args) {

        // create file
        File obj = new File("Hello.txt");

        try {

            if (obj.createNewFile()) {
                System.out.println("File Created Successfully!");
            } else
                System.out.println("File alredy present!");

            Scanner kb = new Scanner(System.in);
            System.out.println("Please write text in file:");
            String txt = kb.nextLine();

            FileWriter w = new FileWriter(obj, true);
            w.write(txt);
            w.close();
            System.out.println("File closed Successfully");

        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }
}
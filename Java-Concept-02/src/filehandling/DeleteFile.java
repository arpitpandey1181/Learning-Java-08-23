package filehandling;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {

        File f = new File("Hello.java");

        try {
            if (f.createNewFile())
                System.out.println("File Created!");
            else
                System.out.println("File Alredy Present!");

            f.delete();
            System.out.println("File Deleted Successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Tester03 {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("D:\\test\\a.txt");
            int i;
            while ((i = file.read()) != -1)
                System.out.print((char) i);
            file.close();

        } catch (IOException e) {
            System.out.println("File reading is not possible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

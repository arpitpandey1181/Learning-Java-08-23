package exceptions.checkedx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tester01 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("D:\\java.txt");

        try {
            for (int i = file.read(); i != -1; i = file.read()) {
                System.out.print((char) i);
            }
            file.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

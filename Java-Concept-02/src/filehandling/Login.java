package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter Your Password!");

        Scanner kb = new Scanner(System.in);
        String pass = kb.nextLine();
        String DBPass = null;
        // login code
        try {
            File database = new File("Passwords.txt");
            database.createNewFile();
            Scanner reader = new Scanner(database);

            // System.out.println(reader.nextLine());

            while (reader.hasNextLine()) {
                DBPass = reader.nextLine();
            }

            if (pass.equals(DBPass))
                System.out.println("Login Successfully!");
            else
                System.out.println("Password is wrong! Login failed");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // validation

    }
}

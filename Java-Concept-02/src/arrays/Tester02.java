package arrays;

import java.util.Scanner;

public class Tester02 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String[] fruts = new String[5];

        System.out.println("Enter frutes in array: ");

        for (int i = 0; i < fruts.length; i++) {
            fruts[i] = kb.nextLine();
        }

        System.out.println("Frutes present in array: ");

        for (int i = 0; i < fruts.length; i++)
            System.out.print(fruts[i] + " ");

        System.out.println("\nEnd!");

    }
}

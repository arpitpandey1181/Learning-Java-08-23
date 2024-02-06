package arrays.exersise02;

import java.util.Scanner;

public class Tester02 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String[][] playes = new String[4][2];
        String[] country = { "India", "Australia", "Engliend", "Pakistan" };

        // input
        String name = null;
        for (int row = 0; row < playes.length; row++) {
            System.out.println("Enter " + country[row] + "'s player name: ");

            for (int col = 0; col < playes[0].length; col++) {
                name = kb.next();

                playes[row][col] = name;
            }
        }

        // ouput

        for (int row = 0; row < playes.length; row++) {
            System.out.println(country[row] + " Playe's name: ");

            for (int col = 0; col < playes[0].length; col++) {
                System.out.print(playes[row][col] + "  ");
            }
            System.out.println();

        }

    }
}

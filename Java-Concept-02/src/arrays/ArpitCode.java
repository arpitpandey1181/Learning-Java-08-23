package arrays;

import java.util.Scanner;

public class ArpitCode {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        int m = ab.nextInt();
        ab.nextLine();

        String[] brr = new String[3];

        System.out.println("Enter " + m + " String name ");

        for (int j = 0; j < brr.length; j++) {
            brr[j] = ab.nextLine();
        }

        for (int j = 0; j < m; j++) {
            System.out.println("Element at index " + j + " : " + brr[j]);

        }

    }
}

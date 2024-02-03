package arrays;

import java.util.Scanner;

public class InsertAccess {
    public static void main(String[] args) {

        // Take a arrays size from user
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Size of an array: ");
        int n = kb.nextInt();

        int[] arr = new int[n];

        // Insert element in an array
        System.out.println("Enter " + n + " elements in array: ");

        // using for loop
        for (int i = 0; i < arr.length; i++)
            arr[i] = kb.nextInt();

        // close resorce
        kb.close();

        // Access Data from array
        System.out.println("Elements present in an array: ");

        // using enhanced loop
        for (int element : arr)
            System.out.print(element + " ");

        System.out.println("\nThank You!");

    }
}

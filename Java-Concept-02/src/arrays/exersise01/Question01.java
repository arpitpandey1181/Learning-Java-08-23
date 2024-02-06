package arrays.exersise01;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        // take 5 size of int array and print sum of all the values

        Scanner kb = new Scanner(System.in);

        int[] arr1 = new int[5];
        int sum = 0;

        System.out.println("Enter values in array: ");

        for (int i = 0; i < arr1.length; i++)
            arr1[i] = kb.nextInt();

        System.out.println("Buffer value " + kb.nextInt());
        System.out.println("Buffer value " + kb.nextInt());
        System.out.println("Buffer value " + kb.nextInt());

        for (int i = 0; i < arr1.length; i++)
            sum = sum + arr1[i];

        System.out.println("Sum is: " + sum);

    }
}

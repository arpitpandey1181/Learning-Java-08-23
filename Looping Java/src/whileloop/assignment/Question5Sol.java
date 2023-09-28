package whileloop.assignment;

import java.util.Scanner;

// 5. Write a Java program that prompts the user to enter a number and prints whether the number is prime or not using a while loop.
public class Question5Sol {
    public static void main(String[] args) {

        // take number from user and print the even numbers to that number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check the number is prime or not = ");
        int num = sc.nextInt();
        sc.close();
        int i = 2;
        int count = 0;
        while (i <= num / 2) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("is prime number");
        } else {
            System.out.println("is not prime number");
        }

    }
}

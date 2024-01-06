package exceptions;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        // run time errors

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        kb.close();

        // login

        int ans = 0;

        ans = num1 / num2;

        System.out.println("Division is: " + ans);

    }
}

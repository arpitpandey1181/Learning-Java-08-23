package exceptions;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        // run time errors

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        kb.close();

        // login

        int ans = 0;

        try {
            ans = num1 / num2;

        } catch (RuntimeException e) {

            System.out.println("Denominator should be more then 0");
        }

        System.out.println("Division is: " + ans);

        ans = num1 + num2;
        System.out.println("Addiction is: " + ans);

    }
}

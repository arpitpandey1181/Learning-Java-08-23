package exceptions;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        // run time errors

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        // login
        int ans = 0;

        try {
            ans = num1 / num2;
        } catch (Exception e) {
            System.out.println("Denominator should be moe then 0");
        } finally {
            kb.close();
        }
        System.out.println("Ans is: " + ans);

    }
}

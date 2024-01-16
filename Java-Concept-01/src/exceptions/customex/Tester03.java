package exceptions.customex;

import java.util.Scanner;

public class Tester03 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int age = kb.nextInt();
        kb.close();

        if (age < 18) {
            throw new ArithmeticException("Age should be more then 17 for vote!");
        } else {
            System.out.println("You are eligible for vote!");
        }

    }
}

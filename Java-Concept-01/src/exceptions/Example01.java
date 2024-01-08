package exceptions;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        // run time error
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        kb.close();

        int arr[] = new int[3];
        arr[0] = 90;

        // login
        int ans = 0;

        try {
            // ans = num1 / num2;
            arr[10] = 89;
            ans = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Denomenitor should not be zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size is more then actual array");
        } catch (Exception e) {
            System.out.println("Exacption occured!");
        }

        System.out.println("Division is: " + ans);
        ans = num1 + num2;
        System.out.println("Addition is: " + ans);

    }
}

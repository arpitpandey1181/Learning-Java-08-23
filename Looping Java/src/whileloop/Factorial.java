package whileloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // take number from user and print the even numbers to that number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt(); // 10
        sc.close();

        // 5 = 5 * 4 = 20 * 3 = 60 * 2 = 120 * 1 = 120
        int factorial = 1;

        while( num > 1){
           factorial =  factorial * num;
           num--;
        }
        System.out.println(factorial);
    }
}

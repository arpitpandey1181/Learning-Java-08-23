package whileloop;

import java.util.Scanner;

public class ReverseIncBy2 {
    public static void main(String[] args) {
        // take number from user and print the even numbers to that number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt(); // 10
        sc.close();

        // num from 1 by 2 increment

        while( num >= 1){

            System.out.print(num+" ");
            num -= 6;


            // System.out.print(num+" ");
            // num -= 3;


            // System.out.print(num+" ");
            // num -= 2;

            // if(num%2 == 0)
            //     System.out.print(num+" ");
            // num--;
        }

    }
}

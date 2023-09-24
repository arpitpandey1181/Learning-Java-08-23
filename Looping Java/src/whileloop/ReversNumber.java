package whileloop;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        
        // take number from user and print the even numbers to that number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt(); // 10
        sc.close();

        // from num to 1

        while( num >= 1 ){
            System.out.print(num+" ");
            num--;
        }

    }
}

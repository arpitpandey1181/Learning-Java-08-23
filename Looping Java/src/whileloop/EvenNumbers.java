package whileloop;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        
        // take number from user and print the even numbers to that number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();  // 10
        sc.close();

        // using while loop
        int i = 1;

        while( i <= num ){

            if( i % 2 == 0){
                System.out.print(i +" ");
            }
            i++;
        }
        
    }
}

package whileloop.assignment;

import java.util.Scanner;

// 5. Write a Java program that prompts the user to enter a number and prints whether the number is prime or not using a while loop.
public class Question5Sol {
    public static void main(String[] args) {
         // take number from user and print the even numbers to that number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = sc.nextInt(); // 10
        sc.close();

        int i = 2;                        
        int count = 0;  // main logic

        if(num1 > 0){
             
            while( i < num1 ){             
                    // 10 % 2 => 10/2 = ans = 5 , rem = 0
                if( num1 % i == 0){         
                    ++count;
                    break;
                }
                i++;                       
            }

            if(count == 0){
                System.out.println(num1+ " Prime Number");
            }else{
                System.out.println(num1+ " Not Prime!");
            }

        }else{
            System.out.println("Number should be positive!");
        }


    }
}

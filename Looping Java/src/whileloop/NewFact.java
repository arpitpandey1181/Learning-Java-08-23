package whileloop;

import java.util.Scanner;

public class NewFact {
    public static void main(String[] args) {
         // take number from user and print the even numbers to that number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt(); // 10
        sc.close();
        int fact = 1;
        int  i =1;
        while(i <= num){
            fact = fact *i;
            i++;
        }
        System.out.println(fact);

        
    }
}

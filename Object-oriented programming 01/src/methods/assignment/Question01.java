package methods.assignment;

import java.util.Scanner;

class Soluction01 {
    // Write a Java method called isPrime that takes an integer as input and returns
    // a boolean value indicating whether the input number is a prime number or not

    // Write a Java method called calculateFactorial that takes a non-negative
    // integer as input and returns its factorial. The factorial of a non-negative
    // integer N, denoted as N!, is the product of all positive integers less than
    // or equal to N.
    void factorial(int num){
        if(num >= 0){
           int ans = 1;
           for(int i = 1; i <= num; i++){
             ans *= i;
            }
         System.out.println(ans);
        }
        else{
            System.out.println("Your number is Negative : ");
        }
    }
    void prime(int num){
          if(num%2==0){
             System.out.println("it is prime number");
           }
          else{
             System.out.println("it is not prime number");
           }
    }
}

public class Question01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System .in);
         System.out.println("Enter number : ");
         int n = sc.nextInt();
         Soluction04 fac = new Soluction04();
         fac.factorial(n);
         fac.prime(n);
    }
}

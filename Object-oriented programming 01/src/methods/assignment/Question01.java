package methods.assignment;

import java.util.Scanner;

class Soluction01 {
    // Write a Java method called isPrime that takes an integer as input and returns
    // a boolean value indicating whether the input number is a prime number or not

    // Write a Java method called calculateFactorial that takes a non-negative
    // integer as input and returns its factorial. The factorial of a non-negative
    // integer N, denoted as N!, is the product of all positive integers less than
    // or equal to N.
    double calculateFactorial(int num) {
        if (num >= 0) {
            int ans = 1;
            for (int i = 1; i <= num; i++) {
                ans *= i;
            }
            return ans;
        } else {
            return -1;
        }
    }

    boolean isPrime(int num) {
        if (num > 0) {
            // number should be divided only with itself.
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();

        Soluction01 fac = new Soluction01();
        boolean isPrime = fac.isPrime(n);
        System.out.println("Number is prime: " + isPrime);

        double factorial = fac.calculateFactorial(n);
        System.out.println("Factorial of a number is: " + factorial);
    }
}

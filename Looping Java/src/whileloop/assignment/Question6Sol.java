package whileloop.assignment;

// 6. Write a Java program to check if a number is a palindrome using a while loop.  hint:  r=n%10; sum=(sum*10)+r; n=n/10;

public class Question6Sol {
    public static void main(String[] args) {
        
        int num = 18982580;
        int ans = num / 10;
        int rem = num % 10;

        System.out.println(ans);
        System.out.println(rem);
    }
}

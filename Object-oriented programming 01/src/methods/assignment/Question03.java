package methods.assignment;

class Soluction03 {

    // Create a Java method called isPalindrome that takes a int as input and
    // returns true if the int is a palindrome (reads the same forwards and
    // backward), and false otherwise. example :
    // input -> 121 , ouput -> true
    // input -> 123 , ouput -> false

    // Write a Java method called computePower that takes two integers, base and
    // exponent, as input and returns the result of raising the base to the power of
    // the exponent.
    void isPalindrome(int n){
        int i,sum=0;
        while(n>0){
            i = n%10;
            sum = (sum*10)+i;
            n=n/10;
        }
        if(n==sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

}

public class Question03 {
    public static void main(String[] args) {
        Soluction03 s03 = new Soluction03();
        s03.isPalindrome(121);
    }
}

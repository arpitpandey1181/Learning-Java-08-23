
package methods.assignment;
import java.util.Scanner;;

class Soluction04 {
    // take a input from user and calculate it's factorial if the number is prime
    // number Here you have to create 2 methods one is factorial and other is prime
    int num;
    void factorial(int num){
        int ans = 1;
        for(int i = 1; i <= num; i++){
            ans *= i;
       }
       System.out.println(ans);
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
public class Question04 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System .in);
         System.out.println("Enter number : ");
         int n = sc.nextInt();
         Soluction04 fac = new Soluction04();
         fac.factorial(n);
         fac.prime(n);
    }
}

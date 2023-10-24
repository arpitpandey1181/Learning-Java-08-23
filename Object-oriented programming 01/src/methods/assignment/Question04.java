
package methods.assignment;
import java.util.Scanner;;

class Soluction04 {
    // take a input from user and calculate it's factorial if the number is prime
    // number Here you have to create 2 methods one is factorial and other is prime
    boolean prime(int num){
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
    int factorial(int num){
        if(prime(num)){
            int ans = 1;
            for(int i = 1; i <= num; i++){
               ans *= i;
            }
        return ans;
      }else{
            return -1;
        }
}
    
public class Question04 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System .in);
         System.out.println("Enter number : ");
         int n = sc.nextInt();
         sc.close();
        
         Soluction04 sol4 = new Soluction04();
         int fact = sol4.factorial(n);
         System.out.println("Factorial is: "+ fact);
    }
}

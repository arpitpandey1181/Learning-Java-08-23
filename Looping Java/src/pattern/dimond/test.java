package pattern.dimond;
// * 
// ** 
// *** 
// **** 
// ***** 
// **** 
// *** 
// ** 
// *
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.print("Enter number = ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i = 1; i <=n ; i++){
        for(int j = 1; j <=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
        for(int i = n-1; i >= 1 ; i--){
         for(int j = 1; j <=i; j++){
            System.out.print("*");
         }
        System.out.println();
       }

    }
}
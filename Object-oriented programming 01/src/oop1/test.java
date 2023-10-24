package oop1;
import java.util.Scanner;
class Cal{
    int add(int a, int b){
        return a + b;
    }
    int sub(int a, int b){
        return a - b;
    }
    int multi (int a, int b){
        return a * b;
    }
    int div(int a, int b){
        return a / b;
    }
    
}
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        System.out.println("Enter two number = ");
        System.out.println("num1 = ");
        int x = sc.nextInt();
        System.out.println("num2 = ");
        int y = sc.nextInt();
        Cal ca = new Cal();
        int ans;
        ans = Ca.add(10,20);  
        System.out.println(ans);      
    }
}

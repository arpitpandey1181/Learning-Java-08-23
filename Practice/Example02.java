package practice;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        System.out.println("enter two number ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        int [] a = new int[5]; 
         
        try{
             ans = x / y;
             a[9] = 20; 
        }
        catch(ArithmeticException ae)
        {
           System.out.println("arthmetic eear");
        }
        catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println("array size......");
        }
        catch(Exception e)
        {
            System.out.println(" Eear = line number 13 ");
        }
        System.out.println(ans);
    }
}

package practice;
import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
         
        try{
             ans = x / y;
        }
        catch(Exception e)
        {
            System.out.println(" Eear = line number 13 ");
        }
        System.out.println(ans);
    }

}

package pattern.dimond;
// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= n*2-i*2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
           System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            for(int j = i*2-2; j >= 1;j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

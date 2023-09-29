package pattern;

// * 
// ** 
// *** 
// **** 
// ***** 
// **** 
// *** 
// ** 
// *
public class Pattern13 {
    public static void main(String[] args) {

        int n = 5;

        // for row
        for (int i = 1; i <= 2 * n - 1; i++) {
            // for *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = n - i; j >= 1; j--) {
                System.out.print("&");
            }
            System.out.println();

        }

    }
}

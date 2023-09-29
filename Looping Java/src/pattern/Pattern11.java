package pattern;

// ***** 
// **** 
// *** 
// ** 
// * 
public class Pattern11 {
    public static void main(String[] args) {

        // for row
        for (int i = 5; i >= 1; i--) {
            // for col
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

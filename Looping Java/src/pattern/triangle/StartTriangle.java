package pattern.triangle;

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * *
public class StartTriangle {
    public static void main(String[] args) {
        int n = 5;
        // row
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // start
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }
}

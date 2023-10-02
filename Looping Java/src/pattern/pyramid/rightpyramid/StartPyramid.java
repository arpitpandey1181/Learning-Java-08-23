package pattern.pyramid.rightpyramid;

//     *
//    **
//   ***
//  ****
// *****
public class StartPyramid {
    public static void main(String[] args) {
        int n = 5;

        // row
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            // start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }
}

package pattern.dimond;

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
public class FirstWayFullDimond {
    public static void main(String[] args) {
        int n = 5;
        // first part
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }

        // second part
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            // start
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }
}

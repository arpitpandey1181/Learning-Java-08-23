package forloop;

// * * * * *  * * * * *  * * * * * * * *
// * * * * *  * * * * *  * * * * * * * *
// * * * * *  * * * * *  * * * * * * * *
// * * * * *  * * * * *  * * * * * * * *
// # # # # #  # # # # #  # # # # # # # #   i = 5
// * * * * *  * * * * *  * * * * * * * *
// * * * * *  * * * * *  * * * * * * * *
// * * * * *  * * * * *  * * * * * * * *
// * * * * *  * * * * *  * * * * * * * *

public class Pattern1 {
    public static void main(String[] args) {

        for (int l = 1; l <= 9; l++) {

            for (int i = 1; i <= 15; i++) {
                if (l == 5) {
                    System.out.print("# ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

    }
}

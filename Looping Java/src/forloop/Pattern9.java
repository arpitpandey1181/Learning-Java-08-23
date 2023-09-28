package forloop;

// 2 4 6 8 10 12 14 16 18 20
// 3 . . . .
// 4 . . . .
// 20 . . 
public class Pattern9 {
    public static void main(String[] args) {

        // print 2 to 20 table
        for (int i = 2; i <= 20; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

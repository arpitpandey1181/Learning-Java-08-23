package forloop;

// 9 18 27 36 45
// 8 16 24 32 40
// 7 14 21 28 35
// 6 12 18 24 30
public class Pattern8A {
    public static void main(String[] args) {

        for (int i = 9; i >= 6; i--) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");
            }

            System.out.println();
        }
    }
}

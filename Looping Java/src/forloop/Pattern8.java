package forloop;

// 9 18 27 36 45
// 8 16 24 32 40
// 7 14 21 28 35
// 6 12 18 24 30
public class Pattern8 {
    public static void main(String[] args) {

        int n = 4;
        int num = 9;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= 5; j++) {
                System.out.print(num * j + " ");
            }
            num--;
            System.out.println();
        }
    }
}

package forloop;

// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
public class Pattern3 {
    public static void main(String[] args) {

        int n = 4;

        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= 5; j++) {
                // printing pattern
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

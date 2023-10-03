package pattern.pyramid.rightpyramid.assignment;

public class Question4Soluction {
    public static void main(String[] args) {
        int n = 4;
        int m = 9;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print(m);
                m--;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

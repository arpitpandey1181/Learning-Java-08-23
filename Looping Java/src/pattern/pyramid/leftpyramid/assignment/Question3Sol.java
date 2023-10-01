package pattern.pyramid.leftpyramid.assignment;

// 10
// 10 11
// 10 11 12
// 10 11 12 13
// 10 11 12 13 14
// 10 11 12 13 14 15
public class Question3Sol {
    public static void main(String[] args) {
        int n = 6;
        int m = 10;
        for (int i = 1; i <= n; i++) {
            m = 10;
            for (int j = 1; j <= i; j++) {
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }
}

package pattern.pyramid.leftpyramid.assignment;

// 10 20 30 40 50
// 10 20 30 40
// 10 20 30
// 10 20
// 10
public class Question6Sol {
    public static void main(String[] args) {
        int row = 5;
        for (int i = row; i >= 1; i--) {
            int n = 10;
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n += 10;
            }
            System.out.println();
        }
    }
}

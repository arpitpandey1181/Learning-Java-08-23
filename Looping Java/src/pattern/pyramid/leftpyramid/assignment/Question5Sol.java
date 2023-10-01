package pattern.pyramid.leftpyramid.assignment;

// 10 9 8 7
// 6 5 4
// 3 2
// 1
public class Question5Sol {
    public static void main(String[] args) {
        int row = 4;
        int n = 10;
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n--;
            }
            System.out.println();
        }
    }
}

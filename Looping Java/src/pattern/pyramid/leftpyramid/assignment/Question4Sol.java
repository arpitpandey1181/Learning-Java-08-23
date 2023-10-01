package pattern.pyramid.leftpyramid.assignment;

// A B C D
// A B C
// A B
// A
public class Question4Sol {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

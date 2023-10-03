package pattern.pyramid.rightpyramid.assignment;

//      A
//     BA
//    CBA
//   DCBA
//  EDCBA
// FEDCBA
public class Question3Soluction {
    public static void main(String[] args) {
        int n = 6;
        char ch;
        for (int i = 1; i <= n; i++) {

            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            ch = (char) ('A' + i - 1); // 67 -> C
            for (int j = i; j >= 1; j--) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}

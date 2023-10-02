package pattern.pyramid.rightpyramid.assignment;

//      A
//     BA
//    CBA
//   DCBA
//  EDCBA
// FEDCBA
public class Question3Sol {
    public static void main(String[] args) {
        int n =6;
      for(int i = 1; i <= n; i++){
        char ch = 'A';
        for(int j = n-1; j >= i; j--){
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
      }
    }
}

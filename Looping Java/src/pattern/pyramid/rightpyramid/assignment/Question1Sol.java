package pattern.pyramid.rightpyramid.assignment;

//      1
//     21
//    321
//   4321
//  54321
// 654321
public class Question1Sol {
    public static void main(String[] args) {
      int n =6;
      for(int i = 1; i <= n; i++){
        for(int j = n-1; j >= i; j--){
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--){
            System.out.print(j);
        }
        System.out.println();
      }
    }
}

package pattern.pyramid.rightpyramid.assignment;

// 555555
//  44444
//   3333
//    222
//     11
//      0
public class Question2Sol {
    public static void main(String[] args) {
      int n =6;
      for(int i =0; i <=n-1; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(" ");
           }
           for(int j = n-1; j >= i; j--){
            System.out.print(n-i-1);
           }
           System.out.println();
        }
    }
}

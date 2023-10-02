package pattern.pyramid.rightpyramid.assignment;

// 10 20 30 40 50
//    10 20 30 40
//       10 20 30
//          10 20
//             10
public class Question5Sol {
    public static void main(String[] args) {
        int n =5;
        for(int i = 0; i <= n; i++){
            int m = 10;
         for(int j = 1; j <= i; j++){
            System.out.print("   ");
         }
         for(int j = n-i; j >= 1;j--){
            System.out.print(m);
            m += 10;
            System.out.print(" ");
         }
         System.out.println();
        }

    }
}

package pattern.pyramid.rightpyramid.assignment;

// 10 9 8 7
//    6 5 4
//      3 2
//        1
public class Question4Sol {
    public static void main(String[] args) {
       int n = 4;
       int m = 10;
       for(int i = 0; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("  ");
        }
        for(int j = n-1; j >= i; j--){
            System.out.print(m);
            m--;
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}

package pattern.pyramid.leftpyramid;

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

// when ,
// i = 1 , col = 1
// i = 2 , col = 2
// i = 3 , col = 3
// i = 4 , col = 4
// i = 5 , col = 5

public class startPattern {
    public static void main(String[] args) {

        int n = 5;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

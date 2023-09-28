package forloop;

// * * * * * * 
// * * * * * *
// * * * * * *
// * * * * * * 
// * * * * * * 
// * * * * * * 
public class Pattern2 {
    public static void main(String[] args) {

        int row = 6;
        int col = 6;

        // for row
        for (int i = 1; i <= row; i++) {
            // for colum
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

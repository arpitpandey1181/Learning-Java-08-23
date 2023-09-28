package forloop;

// Z Y X W
// V U T S
// R Q P O 
// N M L K
public class Pattern7 {
    public static void main(String[] args) {

        int n = 4;
        char ch = 'Z';
        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= n; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
    }
}

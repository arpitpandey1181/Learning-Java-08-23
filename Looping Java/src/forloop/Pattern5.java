package forloop;

// A B C D E
// A B C D E
// A B C D E
// A B C D E
// A B C D E
public class Pattern5 {
    public static void main(String[] args) {

        char ch;
        // for row
        for (int i = 1; i <= 5; i++) {
            // for col
            ch = 'A';
            for (int j = 1; j <= 5; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}

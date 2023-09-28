package forloop;

public class Main {
    public static void main(String[] args) {

        // int i = 1;

        // while (i < 10) {
        // System.out.println(i);
        // i++;
        // }

        // syntex: for( initilaction ; condiction ; incement/decrement){}

        // for (int i = 1; i < 10; i++) {
        // System.out.print(i + " ");
        // }

        for (int i = 1;; i++) {
            if (i < 10)
                System.out.print("Hello, World!" + " ");
            else
                break;
        }

    }
}

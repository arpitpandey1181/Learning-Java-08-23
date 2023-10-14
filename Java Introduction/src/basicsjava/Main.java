package basicsjava;

public class Main {
    static int val = 1;

    public static void main(String[] args) {
        // can i call main method
        String[] arr = { "india", "pak" };
        if (val != 10) {
            main(arr);
        }
        Main.val++;
        val--;
    }
}

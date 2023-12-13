package statickyword;

// variable
// block
// methods

class Food {

    private int x = 90;
    public static String name = "Laptop";
    private static String sirName = "Acer";

    static {
        int c = 90;
    }

    public static void getSirName() {
        System.out.println(Food.sirName);
    }

    public static void faltu() {
        System.out.println("Faltu");
    }

    // public void getSirName() {
    // System.out.println(Food.sirName);
    // }

}

public class Tester01 {

    public static int count = 1;

    // static {
    // int count = 1;
    // }

    public static void main() {
        System.out.println("Main Method");
    }

    public static void main(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {

        /*
         * System.out.println(Tester01.count);
         * if (count < 5) {
         * main(args);
         * }
         * System.out.println(Tester01.count);
         */
        System.out.println(Tester01.count); // Print the initial value of count

        if (Tester01.count < 3) {
            Tester01.count++; // Increment count
            main(args); // Recursive call
        }
        System.out.println("Final " + Tester01.count--); // Print the final value of count
    }
}

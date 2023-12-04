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

    static {
        int count = 1;
        int end = 5;
    }

    public static void main() {
        System.out.println("Main Method");
    }

    public static void main(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {

        if (count < 3) {
            main(args);
            count++;
        }
        return;

    }
}

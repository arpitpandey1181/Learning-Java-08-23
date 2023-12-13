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

    public static void main(String[] args) {
        System.out.println(Food.name);
       Food.getSirName();
    

    }
}

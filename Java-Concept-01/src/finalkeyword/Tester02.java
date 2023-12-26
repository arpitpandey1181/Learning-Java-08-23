package finalkeyword;

// final methods

class Demox01 {

    public final void printSomthing() {
        System.out.println("Hello, Text");
    }

    public final void printSomthing(String text) {
        System.out.println("Hello, Text");
    }

}

public class Tester02 {
    public static void main(String[] args) {
        Demox01 d1 = new Demox01();
        d1.printSomthing();
        d1.printSomthing("Some Text");
    }
}

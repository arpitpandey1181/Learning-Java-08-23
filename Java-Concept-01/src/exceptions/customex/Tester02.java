package exceptions.customex;

class Animal extends RuntimeException {

    public Animal(String s) {
        super(s);
    }
}

public class Tester02 {
    public static void main(String[] args) {

        Animal cow = new Animal("Animal Exception Anan Chaiye!");

        System.out.println("Hello From ....");

        throw cow;
    }
}

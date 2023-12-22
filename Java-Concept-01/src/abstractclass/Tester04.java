package abstractclass;

abstract class Exampel02 {

    int num1 = 90;
    int num2 = 89;

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void A() {
        System.out.println("A-> called!");
    }

    public abstract void B();

}

public class Tester04 {
    public static void main(String[] args) {

        Exampel02 ex02 = new Exampel02() {
            public void B() {
                System.out.println("B-> cladded!");
            }

            public void Z() {
                System.out.println("Z-called!");
            }
        };

        ex02.A();
        ex02.B();
        // ex02.Z(); // ERROR
    }
}

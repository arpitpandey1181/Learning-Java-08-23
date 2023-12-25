package abstractclass;

abstract class Exampel01 {

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

class Dem01 extends Exampel01 {
    @Override
    public void B() {
        System.out.println("B-> called!");
    }

    public void Z() {
        System.out.println("Z-called!");
    }

}

public class Tester03 {
    public static void main(String[] args) {

        Dem01 obj1 = new Dem01();
        obj1.A();
        obj1.B();
        obj1.Z();
    }
}

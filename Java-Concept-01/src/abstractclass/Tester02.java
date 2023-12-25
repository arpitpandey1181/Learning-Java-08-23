package abstractclass;

abstract class Demo {

    int data1;
    int data2;

    public void A() {
    };

    public void B() {
    };

    public void C() {
    };

    public void D() {
    };

    public abstract void E();
}

class example extends Demo {
    public void E() {
        System.out.println("E");
    };
}
// class example implements Demo {
// public void E() {

// }
// }

public class Tester02 {
    public static void main(String[] args) {

        example e = new example();

        e.E();
        e.D();
        e.C();
        e.A();
        e.B();

    }
}

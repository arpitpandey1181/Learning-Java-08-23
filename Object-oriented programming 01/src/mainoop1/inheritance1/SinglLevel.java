package mainoop1.inheritance1;

class A1 {

    public A1() {
        System.out.println("Const A called!");
    }

    public A1(int x) {
        System.out.println("Const A  with x called!");
    }

    public void showDataA() {
        System.out.println("A");
    }
}

class B1 extends A1 {

    public B1() {
        System.out.println("Const B called!");
    }

    public B1(int x) {
        super(x);
        System.out.println("Const B with int called!");
    }

    public void showDataB() {
        System.out.println("B");
    }
}

public class SinglLevel {
    public static void main(String[] args) {

        B1 b = new B1(34);

        b.showDataA();
        b.showDataB();
    }
}

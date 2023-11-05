package mainoop1.inheritance1;

class A1 {
    public void showDataA() {
        System.out.println("A");
    }
}

class B1 extends A1 {
    public void showDataB() {
        System.out.println("B");
    }
}

public class SinglLevel {
    public static void main(String[] args) {
        B1 b = new B1();

        b.showDataA();
        b.showDataB();
    }
}

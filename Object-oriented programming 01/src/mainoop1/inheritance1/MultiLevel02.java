package mainoop1.inheritance1;

class A extends Object {
    public void showA() {
        System.out.println("Show->A");
    }
}

class B extends A {
    public void showB() {
        System.out.println("Show->B");
    }
}

class C extends B {
    public void showC() {
        System.out.println("Show->C");
    }
}

class D extends C {
    public void showD() {
        System.out.println("Show->D");
    }
}

public class MultiLevel02 {
    public static void main(String[] args) {
        D d = new D();

        d.showA();
        d.showB();
        d.showC();
        d.showD();
    }
}

// Multi Level Inheritanc
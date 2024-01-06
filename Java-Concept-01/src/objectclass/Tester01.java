package objectclass;

class Demo01 {
    public void printName() {
        System.out.println("Class Name-> xyz");
    }
}

public class Tester01 extends Object {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // creating object
        Demo01 d1 = new Demo01();

        System.out.println(d1.getClass());
        d1.printName();

    }
}

package thredsx;

class Demo {

    public void method1() {

        String thredName = Thread.currentThread().getName();

        System.out.println("In Demo method- " + thredName);
    }
}

public class Tester01 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Demo d1 = new Demo();

        d1.method1();

    }
}

package thredsx;

class MyThred extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
        }
        System.out.println("Database!");
        System.out.println("Thred 1 is running " + currentThread().getName());

    }

}

class MyThred2 extends Thread {
    private int age;

    @Override
    public void run() {
        System.out.println("Display message");
        System.out.println("Thred 2 is running " + currentThread().getName());
    }

}

public class Tester03 {
    public static void main(String[] args) throws Exception {

        MyThred t1 = new MyThred();

        t1.start();

        MyThred2 t2 = new MyThred2();

        t2.start();

        System.out.println(Thread.currentThread().getName());

    }
}

package thredsx;

public class Tester09 {
    public static void main(String[] args) {

        // First way

        Thread t1 = new Thread();

        t1.start();

        System.out.println(t1.getName());

        // Second way

        Thread t2 = new Thread("My Thred Name is Java");

        t2.start();

        System.out.println(t2.getName());

    }
}

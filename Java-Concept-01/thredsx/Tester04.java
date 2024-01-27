package thredsx;

class A extends Thread {

    @Override
    public void run() {
        double ans = 0.0;
        for (int i = 0; i <= 10000; i++)
            ans += i;
        System.out.println("Addition is: " + ans);
    }
}

class B extends Thread {

    @Override
    public void run() {

        double ans = 1.0;
        for (int i = 1; i <= 100; i++)
            ans *= i;
        System.out.println("Multi is: " + ans);
    }
}

public class Tester04 {
    public static void main(String[] args) throws InterruptedException {

        A t1 = new A();
        B t2 = new B();

        t1.start();
        Thread.sleep(100);
        t2.start();

    }
}

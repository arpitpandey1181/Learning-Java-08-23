package thredsx;

class Hello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello");
        }

    }
}

class Hii extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hii");
        }

    }
}

public class Tester05 {
    public static void main(String[] args) {

        Hello t1 = new Hello();

        Hii t2 = new Hii();

        t1.start();
        t2.start();

    }
}

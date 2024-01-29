package thredsx;

class Tata extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Wxception....");
            }
            System.out.println("love");
        }
        System.out.println("thread = 1");
    }
}

class Byy extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Wxception....");
            }
            System.out.println("you");
        }
        System.out.println("thread = 2");
    }
}

public class Tester06 {
    public static void main(String[] args) throws InterruptedException {
        Tata t1 = new Tata();
        Tata t2 = new Tata();
        t1.start();

        System.out.println(t1.getName());
        t2.start();
        System.out.println(t2.getName());
        t2.join();
        System.out.println("hello");
    }
}

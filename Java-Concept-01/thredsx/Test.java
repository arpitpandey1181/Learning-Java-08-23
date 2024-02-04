
//package thredsx;

class MyThredClass implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i < 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

class Addition implements Runnable {
    private double ans;

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Sleep Error " + e);
            }
            this.ans += i;
        }
        System.out.println("Add " + ans);
    }

    public double getAns() {
        return this.ans;
    }
}

class Multiplication implements Runnable {
    private double ans = 1.0;

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Sleep Error " + e);
            }
            this.ans *= i;
        }
        System.out.println("Multi " + ans);
    }

    public double getAns() {
        return this.ans;
    }
}

public class Test {
    public static void main(String[] args) {

        Addition obj1 = new Addition();
        Multiplication obj2 = new Multiplication();

        Thread t1 = new Thread(obj1, "Utkarsha-Add");
        Thread t2 = new Thread(obj2, "Akash-multi");

        try {
            System.out.println("Thred 1 start");
            t1.start();
            System.out.println("Thred 2 start");
            t2.start();

            System.out.println("Wait for t1");
            t1.join();

            System.out.println("Wait for t2");
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Wait for 10 sec for main");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double add = obj1.getAns();
        double multi = obj2.getAns();

        System.out.println(add);
        System.out.println(multi);

    }
}

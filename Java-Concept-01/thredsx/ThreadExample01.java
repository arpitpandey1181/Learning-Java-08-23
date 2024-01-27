package thredsx;

class P extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
        System.out.println("P Finished");
    }
}

class Q extends Thread {
    @Override
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
        System.out.println("Q Finished");
    }
}

public class ThreadExample01 {
    public static void main(String[] args) throws InterruptedException {

        P p = new P();
        Q q = new Q();

        p.start();
        q.start();

        System.out.println("P Join running");
        p.join();

        System.out.println("Thank you");

    }
}

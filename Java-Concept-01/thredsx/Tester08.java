package thredsx;

class D implements Runnable {

    @Override
    public void run() {
        System.out.println("Thred is running from runnable");
    }
}

public class Tester08 {
    public static void main(String[] args) {

        D d = new D();

        Thread td = new Thread(d, "My Thred-01");

        td.start();

        System.out.println(td.getName());

    }
}

package thredsx;

class Demo01 extends Thread {

    @Override
    public void run() {
        String thredName = Thread.currentThread().getName();
        System.out.println("In method - " + thredName);
    }

}

public class Tester02 {
    public static void main(String[] args) {

        Demo01 d01 = new Demo01();

        d01.start();

    }
}

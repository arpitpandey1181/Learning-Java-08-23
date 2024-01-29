package thredsx;

class Demoz implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello");
    }
}

public class Tester07 {
    public static void main(String[] args) {

        Demoz dz = new Demoz();

        Thread tz = new Thread(dz);

        tz.start();

        System.out.println(tz.getName());

    }
}

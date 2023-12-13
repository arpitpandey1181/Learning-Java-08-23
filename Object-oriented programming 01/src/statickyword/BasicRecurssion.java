package statickyword;

class Test01 {

    public void myfun(int n) {

        if (n > 0) {
            System.out.println("Run for " + n);
            myfun(n - 1);
            System.out.println(n);
        }
        System.out.println("Done");
    }
}

public class BasicRecurssion {
    public static void main(String[] args) {
        Test01 t1 = new Test01();
        int n = 3;
        t1.myfun(n);
    }
}

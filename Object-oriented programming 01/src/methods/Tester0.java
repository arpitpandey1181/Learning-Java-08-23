package methods;

// Access Modifiers
// public 
// private
// protected
// default
class Demo02 {
    // we can accees every public data from outside of the class
    public void getGreet() {
        System.out.println("Hello! buddy i am here to help you...");
    }

    private void getGreet01() {
        System.out.println("Hello! buddy i am here to help Only my Demo02...");
    }

    public void getGree01FromOutside() {
        getGreet01();
    }
}

public class Tester0 {
    public static void main(String[] args) {

        Demo02 d2 = new Demo02();

        d2.getGreet();

        d2.getGree01FromOutside();

    }
}

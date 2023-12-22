package abstractclass;

abstract class abstractExample {
    // norml methods, abstract method
    public void A() {
        System.out.println("Hello-> A");
    };

    public abstract void B();
}

interface example {
    public void getExample();

    // public void exampleMethod(){

    // } // NOT
}

class normalClass implements example {
    private String name;
    private int age;

    @Override
    public void getExample() {
        System.out.println("Hello");
    }

    public void getData() {
        System.out.println("Data printed!-> normal class");
    }

    public void Test() {
    };

}

// concrete classes
public class Tester01 {
    public static void main(String[] args) {

        normalClass nm = new normalClass();
    }
}
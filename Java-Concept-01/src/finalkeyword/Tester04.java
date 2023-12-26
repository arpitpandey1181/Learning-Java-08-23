package finalkeyword;

class Laptop {

    public final void compeyName() {
        System.out.println("Apple");
    }

    public String getModelNumber() {
        return "mac-101 sid";
    }
}

class SmartPhone extends Laptop {

    // @Override
    // public void compeyName() {
    // System.out.println("Acer");
    // }

    @Override
    public String getModelNumber() {
        return "iphone-101 ip";
    }
}

public class Tester04 {
    public static void main(String[] args) {

    }
}

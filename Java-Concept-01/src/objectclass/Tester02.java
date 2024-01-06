package objectclass;

class Demo02 {
    private int data;
    private String name;

    public void printData() {
        System.out.println(name + " " + data);
    }

    @Override
    public String toString() {
        return "Data-> " + data + " Name-> " + name;
    }
}

public class Tester02 {
    public static void main(String[] args) {

        Demo02 d2 = new Demo02();

        String returnStr1 = d2.toString();

        System.out.println(returnStr1);

        System.out.println(d2.hashCode());

        String x = "Hello";
        String y = "Hello";

        boolean result = x.hashCode() == y.hashCode();

        System.out.println(result);
    }
}

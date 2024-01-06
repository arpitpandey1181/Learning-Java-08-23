package objectclass;

class Demo03 {

}

public class Tester03 {
    public static void main(String[] args) {

        Demo03 d3 = new Demo03();

        System.out.println(d3.hashCode());

        System.out.println(d3.toString());

        System.out.println(Integer.toHexString(d3.hashCode()));
    }
}

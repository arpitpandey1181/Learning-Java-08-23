package statickyword;

class Demo102 {

    private static int data = 89;

    public static void getData() {
        System.out.println(data);
    }

}

public class Demo101 {
    public static void main(String[] args) {

        Demo102 d2 = new Demo102();

        d2.getData();

        Demo102.getData();

    }
}

package statickyword;

class Test101 {

    static int xcount;

    static {
        xcount = 90;
    }

    public static void setData(int x) {
        System.out.println(Test101.xcount);
    }

    public static void setData() {
        Test101.xcount = 89;
        System.out.println(Test101.xcount);
    }

}

public class Test100 {
    public static void main(String[] args) {

        System.out.println(Test101.xcount);
        Test101.setData(889);

    }
}

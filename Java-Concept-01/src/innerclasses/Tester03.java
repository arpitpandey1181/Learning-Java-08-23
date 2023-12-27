package innerclasses;

class OuterClass03 {
    private int age;

    public void show() {
        class InnerClass03 {
            private int data = 89;

            public void showData() {
                System.out.println(data);
            }
        }
        InnerClass03 inn = new InnerClass03();
        inn.showData();

    }

}

public class Tester03 {
    public static void main(String[] args) {

        OuterClass03 out3 = new OuterClass03();
        out3.show();

    }
}

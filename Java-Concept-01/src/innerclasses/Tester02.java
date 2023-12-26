package innerclasses;

class OuterClass02 {
    private String empName;

    public void printData() {
        System.out.println("Emp Name -> " + empName);
    }

    static class InnerClass02 {
        private String compneyName;

        public void printData() {
            System.out.println("Compney Name -> " + compneyName);
        }
    }
}

public class Tester02 {
    public static void main(String[] args) {

        OuterClass02.InnerClass02 obj2 = new OuterClass02.InnerClass02();

    }
}

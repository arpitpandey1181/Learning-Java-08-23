package innerclasses;

class OuterClass1 {
    private int empId;
    String empName;

    public void printData() {
        System.out.println("Id -> " + empId + " " + " Emp Name -> " + empName);
    }

    class InnerClass1 {
        private String compneyName;
        private float salary;

        public void printData() {
            System.out.println("Compney Name -> " + compneyName + " " + " Salary -> " + salary);
        }
    }
}

public class Tester01 {
    public static void main(String[] args) {

        OuterClass1 out1 = new OuterClass1();
        out1.printData();

        OuterClass1.InnerClass1 obj1 = out1.new InnerClass1();
        // one line
        // OuterClass1.InnerClass1 obj01 = new OuterClass1().new InnerClass1();

        obj1.printData();

    }
}

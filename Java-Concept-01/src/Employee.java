public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Suresh", 34);
    }
}


package constructor;

class Revise1 {

    private int age;
    private String name;

    public Revise1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Revise1() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void printMyData() {
    // System.out.println("Data");
    // }

    // public void printMyData(int x) {
    // System.out.println("Data");
    // }

    // // public void printMyData(int x, double y) {
    // // System.out.println("Data - int -double");
    // // }

    // // public void printMyData(double y, int x) {
    // // System.out.println("Data - dable - int");
    // // }

    // public void printMyData(int y, float x) {
    // System.out.println("Data - float - int");
    // }

    // public void printMyData(int y, int x) {
    // System.out.println("Data - dable - int");
    // }

}

public class Revise {
    public static void main(String[] args) {

        Revise1 r = new Revise1("joy", 67);

        Revise1 r1 = new Revise1();

        // r.setAge(45);
        // r.setName("Jonson");

        int age = r.getAge();
        String name = r.getName();

        System.out.println(age + " " + name);

        // r.printMyData(0, 0);
        // r.printMyData(34, 45.78);
        // r.printMyData(34, 78.45);
    }
}

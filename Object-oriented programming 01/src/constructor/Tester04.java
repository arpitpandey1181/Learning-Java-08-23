package constructor;

class Tester4 {
    private int age;

    public Tester4() {
    }

    public Tester4(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // method
    public int runAge() {
        int currentAge = getAge();
        return currentAge;
    }
}

public class Tester04 {
    public static void main(String[] args) {

        Tester4 sachin = new Tester4(45);

        Tester4 gill = new Tester4(23);

        System.out.println(gill.runAge());

        // System.out.println(sachin.getAge());

        // System.out.println(gill.getAge());
    }
}

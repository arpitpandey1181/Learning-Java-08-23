package finalkeyword;

// class , varibales, methods

final class Human02 {

    private int age = 2;

    public int getAge() {
        return this.age;
    }

    public int getAge(int x) {
        return this.age;
    }
}

// class Demo01 extends Human02 {
// }

// class Demo02 extends Demo01 {
// }

public class Tester01 {
    public static void main(String[] args) {

        Human02 rob = new Human02();
        rob.getAge(2);
    }
}
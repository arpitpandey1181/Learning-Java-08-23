package mainoop1.interface1;

// mulipal inhritance

// interfaces

interface Animal {
    int x = 90;

    void getName();

    int getAge();

    float getValue();

}

class Dog implements Animal {

    @Override
    public void getName() {
        System.out.println("JOn");
    }

    public int getAge() {
        return 1;
    }
}

public class Tester1 {
    public static void main(String[] args) {

    }
}

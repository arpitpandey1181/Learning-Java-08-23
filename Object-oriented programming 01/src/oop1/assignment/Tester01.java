package oop1.assignment;

class Person {
    // implimet this person class
}

public class Tester01 {
    public static void main(String[] args) {

        // Create two Person objects
        Person person1 = new Person();
        Person person2 = new Person();

        // Call methods on the objects
        person1.greet();
        person2.greet();

        person1.haveBirthday();
        person2.haveBirthday();

        person1.move("San Francisco");
        person2.move("Chicago");

    }
}

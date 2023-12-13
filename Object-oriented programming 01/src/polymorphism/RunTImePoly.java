package polymorphism;

// The word polymorphism means having many forms

class Animalz1 {
    public void speak() {
        System.out.println("Animal Speaking");
    }

    public void method1() {

    }

    public void method2() {
        System.out.println("Hello - Method-2");
    }

    public void method3() {

    }
}

class Catz1 extends Animalz1 {
    @Override
    public void speak() {
        System.out.println("Meauuu!");
    }

    @Override
    public void method2() {
        System.out.println("Hii - Method-2");
    }

    public void walk() {
        System.out.println("cat is walking");
    }
}

class Dogz1 extends Animalz1 {
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}

public class RunTImePoly {
    public static void main(String[] args) {
        Animalz1 animalz1 = new Animalz1();
        // animalz1.speak();

        Catz1 catz1 = new Catz1();
        // catz1.speak();

        Dogz1 dogz1 = new Dogz1();
        // dogz1.speak();

        // run time poly

        Animalz1 xyz; // object refrence

        xyz = new Catz1();
        xyz.speak();
        // xyz.walk();
        xyz.method1();
        xyz.method2();

        xyz = new Dogz1(); // Dynamic Method Dispatch
        xyz.speak();
    }
}

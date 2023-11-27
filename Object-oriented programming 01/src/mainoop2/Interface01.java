package mainoop2;

interface Animal {
    void makeSound(); // Abstract method (method without a body)

    void eat();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog sound!");
    }

    @Override
    public void eat() {
        System.out.println(" Dog eating!");
    }

    public void protectHome() {
        System.out.println("Protector of my home");
    }
}

class Cow implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cow sound");
    }

    @Override
    public void eat() {
        System.out.println("Cow eating!");
    }

    public void giveMilk() {
        System.out.println("Cow milk!");
    }
}

public class Interface01 {
    public static void main(String[] args) {

    }
}

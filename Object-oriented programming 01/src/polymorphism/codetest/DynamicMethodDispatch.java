package polymorphism.codetest;

class Animalx {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dogx extends Animalx {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Catx extends Animalx {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animalx animalx = new Dogx();
        animalx.makeSound(); // Output will be "Woof!"

        animalx = new Catx();
        animalx.makeSound(); // Output will be "Meow!"

        animalx.makeSound();
    }
}

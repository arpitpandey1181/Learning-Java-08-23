package polymorphism;

// Compile time polymorphism

// Sttaic polymorphism
// Early Binding
// Static Binding

class Animal {

    public void speak() {
        System.out.println("Meauu!");
    }

    public void speak(String words) {
        System.out.println(words);
    }

    public void value() {
        System.out.println("Values 0");
    }

    public void value(int x) {
        System.out.println(x);
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {

        Animal cat = new Animal();

        cat.speak();
        cat.speak("I am a cat!");

        cat.value();
        cat.value(67);

    }
}

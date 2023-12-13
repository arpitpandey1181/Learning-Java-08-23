package statickyword;

class Parent {
    public void greet() {
        System.out.println("Hello!");
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Hii!");
    }
}

public class Overrding1 {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        obj1.greet();

        Child obj2 = new Child();
        obj2.greet();
    }
}

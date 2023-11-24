package mainoop1.inheritance1;

class Parent {
    private String surname;

    public Parent() {
        this.surname = "Joshi";
    }

    public String getSurName() {
        return this.surname;
    }
}

class Child extends Parent {
    private String name;

    public Child(String name) {
        super();
        this.name = name;
    }

    public String getFullName() {
        return this.name + getSurName();
    }
}

public class Single02 {
    public static void main(String[] args) {

        Child c01 = new Child("Romit ");
        String name = c01.getFullName();
        System.out.println(name);
    }
}

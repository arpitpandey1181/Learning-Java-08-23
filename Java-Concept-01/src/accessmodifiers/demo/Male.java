package accessmodifiers.demo;

public class Male {
    private int age;
    private String name;

    protected String msg = "Hello Anil";

    protected void showName() {
        System.out.println(this.name);
    }

    protected void showAge() {
        System.out.println(this.age);
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setName(String name) {
        this.name = name;
    }
}

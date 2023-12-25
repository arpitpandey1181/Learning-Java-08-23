package finalkeyword;

// varibales
class Demox02 {

    private int age;
    private final String id = "text01";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void demo1() {
        // this.id = "Text102";
        String newId = this.id + " 1789";
    }

}

public class Tester03 {
    public static void main(String[] args) {

    }
}

package methods;

class Demo04 {
    // props
    private String name; // null -> double 0.0 -> float 0.0f, char '/0'
    private int age; // 0
    private char gender; // '\u0000'

    // methods
    public void setName(String name1) {
        name = name1;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public void setGender(char gender1) {
        gender = gender1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

}

public class Tester4 {
    public static void main(String[] args) {

        Demo04 d3 = new Demo04();

        d3.setName("Acer");
        d3.setAge(1);
        d3.setGender('m');

        Demo04 d4 = new Demo04();

        d4.setName("HP");
        d4.setAge(4);
        d4.setGender('f');

        System.out.println(d3.getName());
        System.out.println(d4.getName());

    }

}

package methods;

class Demo03 {
    // props
    private String name; // null -> double 0.0 -> float 0.0f, char '/0'
    private int age; // 0
    private char gender; // '\u0000'

    // methods
    private void setName() {
        name = "Acer";
    }

    private void setAge() {
        age = 1;
    }

    private void setGender() {
        gender = 'M';
    }

    public String getName() {
        setName();
        return name;
    }

    public int getAge() {
        setAge();
        return age;
    }

    public char getGender() {
        setGender();
        return gender;
    }

}

public class Tester3 {
    public static void main(String[] args) {

        Demo03 d3 = new Demo03();

        String name = d3.getName();
        System.out.println(name);

        int age = d3.getAge();
        System.out.println(age);

        char gender = d3.getGender();
        System.out.println("\u0000" + gender);

    }

    public void somthin() {
        System.out.println("do somthing!");
    }
}

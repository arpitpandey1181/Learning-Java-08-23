package mainoop2;

class Parent08 {
    private String fatherName;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Parent08() {

    }

    public Parent08(String fatherName) {
        this.fatherName = fatherName;
    }

}

class Child01 extends Parent08 {
    private String name;
    private int adhaarNumber;

    public Child01() {

    }

    public Child01(String name, int adhaarNumber) {
        this.name = name;
        this.adhaarNumber = adhaarNumber;
    }

    public Child01(String name, int adhaarNumber, String fatherName) {
        super(fatherName);
        this.name = name;
        this.adhaarNumber = adhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(int adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

}

class Child02 extends Parent08 {
    private String name;
    private int adhaarNumber;

    public Child02() {
    }

    public Child02(String name, int adhaarNumber) {
        this.name = name;
        this.adhaarNumber = adhaarNumber;
    }

    public Child02(String name, int adhaarNumber, String fatherName) {
        super(fatherName);
        this.name = name;
        this.adhaarNumber = adhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(int adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

}

public class HiracInheritance {
    public static void main(String[] args) {

        Child01 rob = new Child01("Rob David", 6748, "David Malan");

        Child02 blessy = new Child02("Blessy Malan", 7894, "David Malan");

        System.out.println(rob.getFatherName());

        System.out.println(blessy.getFatherName());

    }
}

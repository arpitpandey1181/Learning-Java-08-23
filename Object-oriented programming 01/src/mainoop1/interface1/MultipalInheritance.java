package mainoop1.interface1;

class Parent1 {
    private String sirName;

    public Parent1(String sirName) {
        this.sirName = sirName;
    }

}

interface Parent2 {

    float avgHeight = 4.5f;
    int housenumber = 897;

    void getAvgHeight();

    int getHouseNumber();

}

class Child extends Parent1 implements Parent2 {

    public Child(String sirName) {
        super(sirName);
    }

    @Override
    public void getAvgHeight() {
        System.out.println(avgHeight);
    }

    @Override
    public int getHouseNumber() {
        return housenumber;
    }

    public void getData() {

    }

    public void getEx() {

    }
}

public class MultipalInheritance {
    public static void main(String[] args) {

    }
}

package accessmodifiers.privateaccess;

class Cat {

    private String catColor;
    private int catAge;

    private Cat() {
    }

    public Cat(int x) {
    }

    // you have to incress cat age by 2
    private int incressCatAge() {
        return catAge + 2;
    }

    public void calculateCatAge() {
        Cat merry = new Cat();
        this.catAge = incressCatAge();
    }

}

class VScode {

}

public class Tester02 {
    public static void main(String[] args) {

        Cat pinku = new Cat(10);
        pinku.calculateCatAge();
    }
}

package methods;

class Tester06 {
    public void passByValue(int x) {
        x = 10;
    }

    public void passByRefrence(String name) {
        name = "India";
    }

    public void passByRefrence(StringBuilder name) {
        name = name;
    }
}

public class Tester6 {
    public static void main(String[] args) {
        Tester06 t6 = new Tester06();
        int x = 1;
        t6.passByValue(90);
        System.out.println(x);

        String name = "Bharat";
        t6.passByRefrence(name);
        System.out.println(name);

        StringBuilder xname = new StringBuilder("Virat");
        System.out.println(xname);
        t6.passByRefrence(xname);
    }
}

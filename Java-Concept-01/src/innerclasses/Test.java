package innerclasses;

class X {
    int num1 = 89;

    static class Y {
        int age;
    }
}

public class Test {
    public static void main(String[] args) {

        X x = new X();
        int ans = x.num1;

        new X.Y();

    }
}

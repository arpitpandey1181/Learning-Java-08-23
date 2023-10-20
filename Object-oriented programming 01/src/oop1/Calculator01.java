package oop1;

class Calculator {
    // methods
    // add, sub, multi, div, mod

    int add(int x, int y) {
        int ans = x + y;
        return ans;
    }

    int sub(int x, int y) {
        return x - y;
    }

    int multi(int x, int y) {
        return x * y;
    }

    int div(int x, int y) {
        return x / y;
    }

    int mod(int x, int y) {
        return x % y;
    }
}

public class Calculator01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int ans;

        ans = cal.add(23, 56);
        System.out.println(ans);

        ans = cal.sub(34, 78);
        System.out.println(ans);

    }
}

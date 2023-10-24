package oop1.assignment;

class Xyz {
    int a = 10;

    int val(int a) {
        return a;
        // hint [ int a = ];
    }
    int take(int x, int s ) {
        int c = x + s;
        return c;
    }
}

public class Tester03 {
    public static void main(String[] args) {
        // call all 2 methods of Xyz class
        Xyz abc = new Xyz();
         int ans;
         ans = abc.val(10);
         ans = abc.take(10, 20);

    }
}

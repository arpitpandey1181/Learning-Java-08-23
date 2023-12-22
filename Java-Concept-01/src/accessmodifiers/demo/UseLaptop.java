package accessmodifiers.demo;

import accessmodifiers.publicaccess.p1.p2.p3.Laptop;

public class UseLaptop {
    public static void main(String[] args) {
        Laptop lap = new Laptop();

        lap.printSomText();
        lap.saySomthing();
    }
}

package innerclasses;

// non-static inner classes
class A {
    class B {
        public void printMsg() {
            System.out.println("Hello!");
        }
    }
}

// static inner class
class X {
    static class Y {
        public void printData() {
            System.out.println("Hii Java!");
        }
    }
}

// local method inner classes

class M {
    public void demo() {
        int num1 = 89;
        int num2 = 78;

        class N {
            public void add() {
                System.out.println("Sum is-> " + (num1 + num2));
            }
        }
        N n = new N();
        n.add();
    }
}
public class Main {
    public static void main(String[] args) {
        // 1
        A a = new A();
        A.B xobj1 = a.new B();
        xobj1.printMsg();

        // 2
        X.Y xobj2 = new X.Y();
        xobj2.printData();
        new X.Y().printData();

        // 3
        M xobj3 = new M();
        xobj3.demo();
    }
}

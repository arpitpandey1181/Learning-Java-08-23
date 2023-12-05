package mainoop2;

// super parent
class Car {
    public void run() {
        System.out.println("Car must run on the road");
    }
}

// parent
class Toyota extends Car {
    public void expansive() {
        System.out.println("Toyota is Expansive car");
    }
}

// ex
// child-1
class Fartunar2X2 extends Toyota {
    public void sitting() {
        System.out.println("2x2 ");
    }
}

// child-2
class Fartunar4X4 extends Toyota {
    public void sitting() {
        System.out.println("4x4 ");
    }
}

public class HybridInheritance01 {
    public static void main(String[] args) {
        Fartunar2X2 far2 = new Fartunar2X2();

        far2.expansive();
        far2.sitting();

    }
}

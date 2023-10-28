package methodoverloding;

class Tester01 {

    // methods names should be same -> method overloding
    // 1. overloding through number of args
    public int calculateNumber() {
        return 0;
    }

    public int calculateNumber(int x) {
        return x;
    }

    public int calculateNumber(int x, int y) {
        return x + y;
    }

    public int calculateNumber(int x, int y, int z) {
        return x + y + z;
    }

    // 2. if number of args are same then , type of args diffrent

    public double calculateNumber(double x, int y) {
        return x + y;
    }

    // 3. change the position of the args
    public double calculateNumber(int x, double y) {
        return x + y;
    }

    // public float calculateNumber(int x, double y) {
    // return x + y;
    // }

    // Note - method overloding is not happen on the bassic of return type

}

public class Tester {
    public static void main(String[] args) {

        Tester01 t1 = new Tester01();

        int result;
        result = t1.calculateNumber(67, 89, 34);
        result = t1.calculateNumber(67, 34);
        result = t1.calculateNumber();

        System.out.println(result);
    }
}

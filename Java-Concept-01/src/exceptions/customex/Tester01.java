package exceptions.customex;

public class Tester01 {
    public static void main(String[] args) {

        ArithmeticException ex = new ArithmeticException();

        System.out.println(ex.getMessage());

        throw ex;

    }
}

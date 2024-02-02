package filehandling;

public class TestCode {
    public static void main(String[] args) {

        try {
            if (89 == 10 / 0)
                System.out.println("Hiii");
            else
                System.out.println("Byyy");

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Error Occured!");
        }

    }
}

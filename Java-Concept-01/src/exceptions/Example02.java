package exceptions;

public class Example02 {
    public static void main(String[] args) {

        int num1 = 89;
        int num2 = 0;
        int ans = 0;

        try {
            ans = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Exception is: " + e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(ans);

    }
}

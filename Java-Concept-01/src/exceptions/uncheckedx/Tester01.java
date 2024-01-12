package exceptions.uncheckedx;

// unchecked
public class Tester01 {
    public static void main(String[] args) {

        // run time errors
        int ans = 0;

        ans = 12 / 0;

        System.out.println("Division is: " + ans);

        /*
         * try {
         * ans = 12 / 0;
         * } catch (ArithmeticException e) {
         * System.out.println(e.getLocalizedMessage());
         * }
         * 
         * System.out.println("Division is: " + ans);
         */

    }
}

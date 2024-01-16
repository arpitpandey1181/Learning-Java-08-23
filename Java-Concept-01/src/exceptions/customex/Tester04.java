package exceptions.customex;

public class Tester04 {
    public static void main(String[] args) {
        System.out.println("Running Code started!");
        int num = 78;
        int result = 0;
        try {
            result = divide(num);
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println(result);
        System.out.println("Ending code ended!");

    }

    public static int divide(int num) {
        int ans = getDivide(num);
        return ans;
    }

    public static int getDivide(int num) {
        return num / 0;
    }
}

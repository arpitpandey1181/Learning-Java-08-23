package arrays.exersise01;

public class Question02 {

    public static void findEven(int num) {

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

    public static void main(String[] args) {

        int[] arr2 = { 12, 34, 67, 87, 90, 871 };

        // find even number from the array

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] % 2 == 0)
                System.out.print(arr2[i] + " ");

        }

    }
}

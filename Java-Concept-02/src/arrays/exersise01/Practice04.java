package arrays.exersise01;

public class Practice04 {
    public static void main(String[] args) {

        int[] arr = { 23, 56, 78, 12, 45 };
        int find = 5;
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                result = true;
            }
        }

        if (result)
            System.out.println("Element is present!");
        else
            System.out.println("Element is not present!");

    }
}

package exceptions.uncheckedx;

public class Tester02 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i <= arr.length; i++)
            arr[i] = 90;

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}

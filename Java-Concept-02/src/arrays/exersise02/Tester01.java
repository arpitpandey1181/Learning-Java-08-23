package arrays.exersise02;

public class Tester01 {
    public static void main(String[] args) {

        // 2D arry

        int[][] arr = new int[3][4];

        arr[0][0] = 23;
        arr[0][1] = 89;
        arr[0][2] = 67;
        arr[0][3] = 100;

        arr[2][1] = 45;

        // print elemts in array

        for (int row[] : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }

        }

    }
}

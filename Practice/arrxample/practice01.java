package practice.arrxample;
//find the negative and positive numbers in an array example - [ 2, 6 , -9, 12, -56, -45]

public class practice01 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, -9, 12, -56, -45 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("arr[" + i + "] Positive = " + arr[i]);
            } else {
                System.out.println("arr[" + i + "] Negative = " + arr[i]);
            }
        }
    }
}

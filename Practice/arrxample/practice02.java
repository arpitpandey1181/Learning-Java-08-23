package practice.arrxample;
// dind the largest element in an array exmaple - [23, 67, 12, 34, 45]

public class practice02 {
    public static void main(String[] args) {
        int[] arr = { 23, 67, 12, 34, 45 };
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("Largest element is : " + ans);
    }
}

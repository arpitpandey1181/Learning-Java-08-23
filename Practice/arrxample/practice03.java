package practice.arrxample;

// find the smallest element in an array example- [12, 67, 12, 78, 89]
public class practice03 {
    public static void main(String[] args) {
        int[] arr = { 12, 67, 12, 78, 89 };
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        System.out.println("Smallest element id : " + ans);
    }
}

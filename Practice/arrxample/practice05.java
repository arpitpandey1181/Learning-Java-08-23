package practice.arrxample;
// count the even and odd numbers present in an arrat exmaple - [ 22, 34, 56, 78, 89, 90, 11]

public class practice05 {
    public static void main(String[] args) {
        int[] arr = { 22, 34, 56, 78, 89, 90, 11 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " This Element is Even");
            } else {
                System.out.println(arr[i] + " this Element is odd ");
            }
        }
    }
}

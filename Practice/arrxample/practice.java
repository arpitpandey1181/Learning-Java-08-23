package practice.arrxample;

//in given array add 9 in every element of array examle - [ 3, 5 , 6, 8 ,9]

public class practice {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 8, 9 };
        int ans;
        for (int i = 0; i < arr.length; i++) {
            ans = arr[i] + 9;
            System.out.println(ans);
        }
    }
}

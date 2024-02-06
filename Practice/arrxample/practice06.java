package practice.arrxample;

//find the average of the given array exmaple- [23, 56, 12, 88, 14 , 34]

public class practice06 {
    public static void main(String[] args) {
        int[] arr = { 23, 56, 12, 88, 14, 34 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / arr.length;

        System.out.println("Average of array : " + average);
    }
}

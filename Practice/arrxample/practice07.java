package practice.arrxample;

// count 0 and 1 in an array exmaple- [ 0, 1 , 0, 0, 1,1,0]

public class practice07 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 1, 1, 0 };
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                num1++;
            } else if (arr[i] == 1) {
                num2++;
            }
        }
        System.out.println("numbre of 0 is : " + num1);
        System.out.println("number of 1 is : " + num2);
    }
}

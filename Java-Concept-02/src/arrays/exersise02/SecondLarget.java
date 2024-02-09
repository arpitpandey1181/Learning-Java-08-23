
package arrays.exersise02;

class SecondLarget {
    public static void main(String[] args) {

        int arr[] = { 23, 100, 12, 34, 45 };

        // max = 100
        // secodMax = 45

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i]) {
                secondMax = arr[i];
            }

        }

        System.out.println("Max Value: " + max);
        System.out.println("Second Max: " + secondMax);

    }
}
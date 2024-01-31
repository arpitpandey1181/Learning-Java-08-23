
public class BinarySearch {

    public static int findIndex(int arr[], int size, int target) {

        int first = 0, last = size - 1, mid;

        // binary search terminaction condition
        while (first <= last) {

            // finf mid
            mid = (first + last) / 2;

            // if target is found
            if (arr[mid] == target)
                return mid;
            // if target is less then arr[mid]
            else if (arr[mid] > target)
                last = mid - 1;
            // if target is grater then arr[mid]
            else
                first = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        // arrya
        int arr[] = new int[5];
        int target;

        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 67;
        arr[3] = 78;
        arr[4] = 89;

        target = 78;

        int index = findIndex(arr, 5, target);

        System.out.println("Target is present at " + index);

    }
}

package practice.arrxample;
//given element is present in an array or not exmaple - [23, 56, 78, 12, 45] find - 56

public class practice04 {
    public static void main(String[] args) {
        int[] arr = { 23, 56, 78, 12, 45 };
        int find = 56;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println(find + " is present in this array");
            }
        }
    }

}

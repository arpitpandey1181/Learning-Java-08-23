package arrays;

class Tester01 {
    public static void main(String[] args) {

        // define

        int arr[] = new int[5];

        // init
        arr[0] = 90;
        arr[1] = 67;
        arr[2] = 45;
        // arr[3] = 34;
        // arr[4] = 12;

        // print

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");

        System.out.println();
        // by loop
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");

    }

}
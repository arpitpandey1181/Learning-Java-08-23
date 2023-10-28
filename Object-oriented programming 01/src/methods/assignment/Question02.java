package methods.assignment;

class Soluction02 {
    // Write a Java method called calculateAverage that takes an 5 integers as input
    // and returns the average of the inputs.

    // Write a Java method called findMax that takes an 5 int as input and returns
    // the maximum value in the values.
    void calculateAverage(int a, int b, int c, int d, int e){
        int sum , ave;
        sum = a+b+c+d+e;
        ave = sum/5;
        System.out.println(ave);
    }

}

public class Question02{
    public static void main(String[] args) {
        Soluction02 s02 = new Soluction02();
        s02.calculateAverage(10, 20, 15, 25, 8);

    }
}

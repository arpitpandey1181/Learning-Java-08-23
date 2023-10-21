package methods;

class Demo05 {
    private int data;
    private boolean ans;

    // setters
    public void setData(int x) {
        data = x;
    }

    public void setAns(boolean y) {
        ans = y;
    }

    // getters
    public int getData() {
        return data;
    }

    public boolean getAns() {
        return ans;
    }

}

public class Tester5 {
    public static void main(String[] args) {

        Demo05 d5 = new Demo05();

        d5.setData(56);
        d5.setAns(true);

        int data = d5.getData();
        boolean ans = d5.getAns();

        System.out.println(data + "   " + ans);
    }
}

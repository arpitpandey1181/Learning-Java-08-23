package mainoop1.inheritance1;

class Gurukul {
    private int bookprice = 100;

    public Gurukul() {
    }

    public Gurukul(int bookprice) {
        this.bookprice = bookprice;
    }

    public int getGukulBookprice() {
        return this.bookprice;
    }
}

class Customer extends Gurukul {

    private int GST = 18;

    // public Customer(int gST) {
    // GST = gST;
    // }

    public int getBookprice() {
        int bookprice = GST + getGukulBookprice();
        return bookprice;
    }

}

public class MultiLevel01 {
    public static void main(String[] args) {

        // Gurukul os = new Gurukul(3400);

        // System.out.println(os.getBookprice());

        Customer rob = new Customer();

        System.out.println(rob.getBookprice());

    }
}

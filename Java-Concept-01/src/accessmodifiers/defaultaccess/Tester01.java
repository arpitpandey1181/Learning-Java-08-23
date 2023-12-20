package accessmodifiers.defaultaccess;

// default -> within package
class Mobile {
    int price = 90000;
    String mobModel;
    private String mobCompney;

    // access_modifier return_type method_name(args){}
    void getPrice() {
        System.out.println(this.price);
    }
}

public class Tester01 {
    public static void main(String[] args) {
        Mobile samsung = new Mobile();
        int price = samsung.price;

        System.out.println(price);
    }
}

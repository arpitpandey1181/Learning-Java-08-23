package accessmodifiers.defaultaccess;

// import java.util.*;
// import accessmodifiers.defaultaccess.*;

public class Tester02 {

    public void demo() {
        // System.out.println(price);
        Mobile intel = new Mobile();
    }

    public void accessData() {
        Mobile intel = new Mobile();
        int intelprice = intel.price;

        System.out.println(intelprice);
    }

    public void accessData01() {
        Mobile intel = new Mobile();
        intel.getPrice();

        int price = intel.price;
        String str = intel.mobModel;

    }
}

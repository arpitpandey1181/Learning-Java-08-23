package accessmodifiers.protectedaccess;

import accessmodifiers.demo.Male;

public class TestProcted extends Male {

    public static void main(String[] args) {

        // Male anil = new Male();

        TestProcted tp = new TestProcted();

        tp.setAge(78);
        tp.showAge();

    }
}

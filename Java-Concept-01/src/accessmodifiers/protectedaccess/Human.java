package accessmodifiers.protectedaccess;

import accessmodifiers.demo.Male;

public class Human extends Male {

    private String name;

    String getName() {
        return name;
    }

    void setNameChild(String name) {
        this.name = name;
    }

    String getMessage() {
        Human anil = new Human();
        return anil.msg;
    }

}

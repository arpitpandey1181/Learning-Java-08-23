package accessmodifiers.protectedaccess;

public class MainHuman {
    public static void main(String[] args) {

        Human anil = new Human();

        anil.setNameChild("Anial bishnoi");
        anil.getName();

        String msg = anil.getMessage();

        System.out.println(msg);

    }
}

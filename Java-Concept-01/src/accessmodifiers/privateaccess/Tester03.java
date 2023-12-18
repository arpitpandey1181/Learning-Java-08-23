package accessmodifiers.privateaccess;

class Arpit {
    private String mobPassword;

    private void setPassword(String pass) {
        this.mobPassword = pass;
    }

    public String getPassword() {
        return this.mobPassword;
    }
}

class Akash {

}

public class Tester03 {
    public static void main(String[] args) {
        Arpit pandy = new Arpit();
        pandy.getPassword();

        Akash yadav = new Akash();
        // yadav.getPassword();
    }
}

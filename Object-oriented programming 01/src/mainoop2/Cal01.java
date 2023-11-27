package mainoop2;

interface Calculator {

    void takeInput();

    int add();

    int sub();

    int muli();
}

class Calsy implements Calculator {
    private int num1;
    private int num2;

    @Override
    public void takeInput() {
        this.num1 = 34;
        this.num2 = 89;
    }

    @Override
    public int add() {
        return num1 + num2;
    }

    @Override
    public int sub() {
        return num1 - num2;
    }

    @Override
    public int muli() {
        return num1 * num2;
    }
}

public class Cal01 {
    public static void main(String[] args) {

        Calsy cal = new Calsy();

        cal.takeInput();
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.muli());
    }
}

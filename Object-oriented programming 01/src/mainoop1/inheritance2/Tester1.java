package mainoop1.inheritance2;

class Student {
    private String name;
    private String stdId;

    public Student(String name, String stdId) {
        this.name = name;
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

}

class Teenager extends Student {
    private int marks;

    public Teenager(String name, String id, int marks) {
        super(name, id);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}

public class Tester1 {
    public static void main(String[] args) {

        Teenager t1 = new Teenager("Jon", "ID101", 400);
    }
}

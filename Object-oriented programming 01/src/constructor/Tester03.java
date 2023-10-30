package constructor;

// constructor ptops
// 1. Constructor must have named as class name
// 2. Return type should not avalibe
// 3. public 

class Tester3 {
    private String empNo;
    private String empName;
    private Float empSal;
    private String empDept;

    // constructos
    public Tester3() {
        // non-pera const
        System.out.println("Construtor called!");
    }

    public Tester3(String empNo) {
        this.empNo = empNo;
    }

    public Tester3(String empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    public Tester3(String empNo, String empName, Float empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }

    public Tester3(String empName, Float empSal) {
        this.empName = empName;
        this.empSal = empSal;
    }

    public Tester3(Float empSal, String empName) {
        this.empName = empName;
        this.empSal = empSal;
    }

    public Tester3(String empNo, String empName, Float empSal, String empDept) { // pera-metrised const
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
        this.empDept = empDept;
        System.out.println("Perametrasied constructor called!");
    }

    // getters
    public String getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public Float getEmpSal() {
        return empSal;
    }

    public String getEmpDept() {
        return empDept;
    }

}

public class Tester03 {
    public static void main(String[] args) {

        Tester3 t31 = new Tester3();

        Tester3 t32 = new Tester3("Emp-101", "Robbert", 3765.8f);

        Tester3 t3 = new Tester3("Emp-101", "Robbert", 3765.8f, "CIS");

        System.out.println(t3.getEmpName() + " " + t3.getEmpDept() + " " + t3.getEmpSal());

    }
}

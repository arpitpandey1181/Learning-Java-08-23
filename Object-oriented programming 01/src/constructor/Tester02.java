package constructor;

class Tester2 {
    private String empNo;
    private String empName;
    private Float empSal;
    private String empDept;

    // defualt constructor
    // setter
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSal(Float empSal) {
        this.empSal = empSal;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    // gettres
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

public class Tester02 {

    public static void main(String[] args) {
        new Tester2();
    }
}

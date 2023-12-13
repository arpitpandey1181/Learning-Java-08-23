package polymorphism.codetest;
class college{
    public void course(){
        System.out.println("b_teck");
    }

     public void course(String CourseName){
        System.out.println(CourseName);
    }

     public void method1() {

    }

}
class CS extends college{
    public void course(){
        System.out.println("MCA");
    } 
    public void course2(){
        System.out.println("MSC");
    }
     public void course(String CourseName){
        System.out.println(CourseName);
    }
}
class diploma extends college{
     public void course(){
        System.out.println("PGDCA");
    }
    public void course2(){
        System.out.println("DCA");
    }
}

public class C_RPoly {
    public static void main(String[] args) {
        // compile time 
        college co = new college();
        co.course();
        co.course("m_teck");
        System.out.println();

        //run time
        college cou;

        cou = new CS();
        cou.course();
        cou.course("LLB");

        cou = new diploma();
        cou.course();
       // cou.course2();
    }
    
}

package mainoop1.inheritance2;
class Parents{
   private String sirName;

   public Parents(){

   }

    public Parents(String sirName) {
        this.sirName = sirName;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }
}
class Child1 extends Parents{
    private String name;
    private int age;

    
    public Child1 (String name, int age) {
        this.name = name;
        this.age = age;
    }
     public Child1 (String name,String sirName, int age) {
        super(sirName);
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    
}

public class Tester3 {
    public static void main(String[] args) {
        Child1 cc1 = new Child1("ram","sharma",18);
        cc1.getName();
        cc1.getAge();
        System.out.println(cc1.getName()+" , " + cc1.getAge());
        
    }
    
}

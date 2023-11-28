package mainoop1.interface1;

interface Univercity1{
    String Location = "bhopal";  
    String getLocation();
}

class Univercity2{
    int course;

    public Univercity2(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    
}
class College extends Univercity2 implements Univercity1{
    @Override
    public String getLocation(){
    return Location;
    }

    String Mediam;

    public College(int course, String mediam) {
        super(course);
        Mediam = mediam;
    }

    public String getMediam() {
        return Mediam;
    }

    public void setMediam(String mediam) {
        Mediam = mediam;
    }

}

public class Tester2 {
    public static void main(String[] args) {
        College co = new College(52, "hindi");
        System.out.println(co.Mediam);
        co.getLocation();
        System.out.println(co.getLocation());
    }

    
}

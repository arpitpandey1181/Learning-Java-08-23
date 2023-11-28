package mainoop2;
class Univercity{
    String UnivercityType ;

    public Univercity(){

    }

    public Univercity(String univercityType) {
        UnivercityType = univercityType;
    }

    public String getUnivercityType() {
        return UnivercityType;
    }

    public void setUnivercityType(String univercityType) {
        UnivercityType = univercityType;
    }
  
}
   class LNCT extends Univercity{
        String nackRanking;

        public LNCT(){

        }

        public LNCT(String univercityType, String nackRanking) {
            super(univercityType);
            this.nackRanking = nackRanking;
        }

        public String getNackRanking() {
            return nackRanking;
        }

        public void setNackRanking(String nackRanking) {
            this.nackRanking = nackRanking;
        }
        
    }
    class TIT extends Univercity{
        int course ;

        public TIT (){

        }

        public TIT(String univercityType, int course) {
            super(univercityType);
            this.course = course;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

    }
    class LN_MEDICAL extends LNCT{
        String MedicalCorseName;

        public LN_MEDICAL(){
            
        }

        public LN_MEDICAL(String medicalCorseName) {
            MedicalCorseName = medicalCorseName;
        }

        public LN_MEDICAL(String univercityType, String nackRanking, String medicalCorseName) {
            super(univercityType, nackRanking);
            MedicalCorseName = medicalCorseName;
        }

        public String getMedicalCorseName() {
            return MedicalCorseName;
        }

        public void setMedicalCorseName(String medicalCorseName) {
            MedicalCorseName = medicalCorseName;
        }
        


    }
    class LN_LAW extends LNCT{
        String CourseName;

        public LN_LAW(){

        }

        public LN_LAW(String courseName) {
            CourseName = courseName;
        }

        public LN_LAW(String univercityType, String nackRanking, String courseName) {
            super(univercityType, nackRanking);
            CourseName = courseName;
        }

        public String getCourseName() {
            return CourseName;
        }

        public void setCourseName(String courseName) {
            CourseName = courseName;
        }
        
    }

public class Hiracllnheritance02 {
    
    public static void main(String[] args) {
       LNCT ln = new LNCT("private","first ranking");
       TIT ti = new TIT("private",72);
       System.out.println(ln.nackRanking);
       System.out.println(ti.course);
       System.out.println(ti.UnivercityType); 
    }
}

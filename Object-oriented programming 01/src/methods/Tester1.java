package methods;

class Demo01 {

    // add two strings
    String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // extra string -> "live in india"
    // virat kolhi lives in india
    String locationOfFullName(String firstName, String lastName) {
        return firstName + " " + lastName + " lives in india";
    }

    String locationOfFullName() {
        return getFullName("Hardik", "Pandaya") + " lives in india";
    }

}

public class Tester1 {
    public static void main(String[] args) {

        Demo01 d1 = new Demo01();
        String fullName = d1.getFullName("Virat", "Kolhi");
        System.out.println(fullName);

        String location = d1.locationOfFullName("Rohit", "Sharma");
        System.out.println(location);

        String getWithLoc = d1.locationOfFullName();
        System.out.println(getWithLoc);
    }
}

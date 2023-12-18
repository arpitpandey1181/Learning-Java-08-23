package accessmodifiers.privateaccess;
// private

class Animal {

    private String animalName;
    private int animalAge;

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

}

public class Tester01 {
    public static void main(String[] args) {

        Animal dog = new Animal();
        // String name = dog.animalName; // not possible
        // dog.setAnimalName("Robin"); // not possible

    }
}

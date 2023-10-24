package oop1.assignment;

/* 
Assignment: Create a Java Class for a Dog

Instructions:

1. Create a Java class called Dog.
2. The Dog class should have the following instance variables (attributes):
    name (a string representing the dog's name)
    age (an integer representing the dog's age)
    breed (a string representing the dog's breed)

    The Dog class should have the following methods:
    - public void bark()
    - public void eat()
    - public void celebrateBirthday()

 */
class Dog{
    private String name;
    private int age ;
    private String breed;

    public void bark(String name1){
       name = name1;
    }
    public void eat(int age1){
        age = age1;
    }
    public void celebrateBirthday(String breed1){
        breed = breed1 ;
    }
    public String getbark(){
        return name;  
    }
    public int geteat(){
        return age;
    }
    public String getcelebrateBirthday(){
        return breed;
    }

}
public class Tester02 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark("pappy");
        d.eat(12);
        d.celebrateBirthday("jarman");

        System.out.println(d.getbark());
    }

}

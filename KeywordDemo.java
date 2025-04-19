 // Abstract class with abstract and concrete methods
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name; 
    }

    abstract void sound(); 

    void display() {
        System.out.println("Animal name: " + this.name); 
    }
}
// Subclass implements abstract method
class Dog extends Animal {
    static String breed = "Labrador"; 

    Dog(String name) {
        super(name); // calling parent class constructor
    }

    // Overriding abstract method
    void sound() {
        System.out.println("Dog barks!");
    }

    // static method
    static void showBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class KeywordDemo {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("use of keywords 1. this 2. static 3.abstract");
        System.out.println("---------------------------------------------");
        Dog dog1 = new Dog("Buddy");
        dog1.display();       
        dog1.sound();         
        Dog.showBreed();      
    }
}


// Interface Inheritance (used to demonstrate hybrid & multiple inheritance)
interface Printable {
    void print();
}
interface Showable {
    void show();
}
// Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}
// Multilevel Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}
// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}
// Hybrid Inheritance using Interfaces
class Printer implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Single, Multilevel, Hierarchical
        System.out.println("--- Multilevel Inheritance ---");
        Puppy puppy = new Puppy();
        puppy.eat();   // from Animal
        puppy.bark();  // from Dog
        puppy.weep();  // from Puppy

        System.out.println("\n--- Hierarchical Inheritance ---");
        Cat cat = new Cat();
        cat.eat();     // from Animal
        cat.meow();    // from Cat

        // Hybrid Inheritance via Interfaces
        System.out.println("\n--- Hybrid/Interface Inheritance ---");
        Printer printer = new Printer();
        printer.print();
        printer.show();
    }
}

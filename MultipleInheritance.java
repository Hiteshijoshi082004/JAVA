// First interface
interface A {
    void displayA();
}
// Second interface
interface B {
    void displayB();
}
// Class implementing both interfaces (Multiple Inheritance)
class C implements A, B {
    public void displayA() {
        System.out.println("This is method from Interface A");
    }

    public void displayB() {
        System.out.println("This is method from Interface B");
    }

    void displayC() {
        System.out.println("This is method from Class C");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("multiple inheritance using interface");
        System.out.println("-----------------------------------");
        C obj = new C();
        obj.displayA(); // from A
        obj.displayB(); // from B
        obj.displayC(); // from C
    }
}

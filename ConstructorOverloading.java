 class Student {
    String name;
    int age;
    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.age = 18; // default age
    }
    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ConstructorOverloading
 {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("concept of constructor overloading in java");
        System.out.println("-------------------------------------------");
        Student s1 = new Student();              
        Student s2 = new Student("Hiteshi");       
        Student s3 = new Student("Hiteshi", 21);     

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}

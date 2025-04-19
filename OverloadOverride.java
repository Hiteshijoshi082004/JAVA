class Shape {
    
    void area() {
        System.out.println("Calculating area (generic shape)");
    }

    void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}
// Child class
class Circle extends Shape {
    
    @Override
    void area() {
        System.out.println("Calculating area of a circle (override)");
    }

    void area(double radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}

public class OverloadOverride {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("method overloading and method overriding in java");
        System.out.println("-------------------------------------------------");
        Shape shape = new Shape();
        shape.area();
        shape.area(5);
        shape.area(4, 6);

        System.out.println();

        
        Circle circle = new Circle();
        circle.area();             // Overridden method
        circle.area(3.5);          // Overloaded method in subclass
    }
}


//  OUTPUT: Calculating area (generic shape)
// Area of square: 25
// Area of rectangle: 24

// Calculating area of a circle (override)
// Area of circle: 38.465
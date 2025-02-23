class AreaofShapesusingmethods {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Area of different shapes");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Area of the Circle with radius 5 ="+ Circle(5));
        System.out.println("Area of the Rectangle with length 10 and breadth 25 ="+ Rectangle(10,25));
        System.out.println("Area of the Triangle with breadth 20 and height 15  ="+ Triangle(20,15));
        System.out.println("Area of the Square with side 22 ="+ Square(22));
    }
    // FUNCTION 1 INDICATING AREA OF CIRCLE 
    public static double Circle(double r){
        return (3.14)*r*r;
    }
    // FUNCTION 2 INDICATING AREA OF REACTANGLE 
    public static double Rectangle(int l, int b){
        return l*b;
    }
    // FUNCTION 3 INDICATING AREA OF TRIANGLE 
    public static double Triangle(int b, int h){
        return (b*h)/2;
    }
    // FUNCTION 4 INDICATING AREA OF SQUARE 
    public static double Square(int s){
        return s*s;
    }
}

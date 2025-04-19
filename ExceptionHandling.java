public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Exception Handling in java");
        System.out.println("----------------------------");
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        try {
            String number = "abc";
            int n = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        try {
            Object obj = new Object();
            String s = (String) obj;
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println("Program completed successfully.");
    }
}

// PUT:ArithmeticException caught: / by zero
// ArrayIndexOutOfBoundsException caught: Index 5 out of bounds for length 3
// NullPointerException caught: Cannot invoke "String.length()" because "str" is null
// NumberFormatException caught: For input string: "abc"
// Generic Exception caught: ClassCastException - class java.lang.Object cannot be cast to class java.lang.String
// Program completed successfully.OUT

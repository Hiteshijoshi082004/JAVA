public class commandline {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Sum of two numbers using command line arguments");
        System.out.println("-------------------------------------------------------");
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java commandline <num1> <num2>");
            return;
        }
        try {
            // Parse command line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            // Compute sum
            int sum = num1 + num2;
            
            // Display result
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter two integers.");
        }
    }
}


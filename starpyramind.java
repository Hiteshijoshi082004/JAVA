public class starpyramind {
        public static void main(String[] args) {
            System.out.println("HITESHI JOSHI");
            System.out.println("17032249057");
            System.out.println(" Star Pyramid Pattern");
            System.out.println("-------------------------");
            int rows = 5; // Number of rows in the pyramid
    
            for (int i = 1; i <= rows; i++) {
                // Print spaces before the stars
                for (int j = rows - i; j >= 1; j--) {
                    System.out.print(" ");
                }
    
                // Print stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
    
                // Move to the next line
                System.out.println();
            }
        }
}

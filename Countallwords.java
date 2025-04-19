import java.util.Scanner;

public class Countallwords {
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Count all words in a string ");
        System.out.println("-------------------------");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}

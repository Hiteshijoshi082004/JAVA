import java.util.Scanner;

public class CountVowelsinstring {
    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Count vowels in a string ");
        System.out.println("-------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();
    }
}


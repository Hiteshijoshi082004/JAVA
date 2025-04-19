import java.util.Scanner;
public class smallestnumber {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println(" Smallest Number among 22three numbers");
        System.out.println("-------------------------");
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = Scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = Scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = Scanner.nextDouble();

        double smallest;

        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}

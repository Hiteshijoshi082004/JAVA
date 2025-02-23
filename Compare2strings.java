import java.util.Scanner;
public class Compare2strings {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Compare Two Strings");
    System.out.println("---------------------");
    System.out.println("Enter first String: ");
    String s1 = sc.nextLine();
    System.out.println("Enter second String: ");
    String s2 = sc.nextLine();
    if (s1.equals(s2)) {
      System.out.println("String s1 and s2 are equal.");
    }
    else System.out.println("String s1 and s2 are not equal.");
      }
}


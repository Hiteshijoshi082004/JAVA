import java.util.Scanner;
public class Concatenate2str {
  public static String concatString(String s1, String s2){
    String s3 = s1.concat(s2);
    return s3;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Concatenate Two Strings");
    System.out.println("----------------------------");
    System.out.println("Enter first string: ");
    String s1= sc.nextLine();
    System.out.println("Enter second string: ");
    String s2= sc.nextLine();
    System.out.println("The concatenated string is: " + concatString(s1, s2));
  }
}

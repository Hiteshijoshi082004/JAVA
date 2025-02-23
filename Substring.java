import java.util.Scanner;
public class Substring {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("HITESHI JOSHI");
  System.out.println("17032249057");
  System.out.println("Print a Substring ");
  System.out.println("---------------------");
  System.out.println("Enter the String: ");
  String str = sc.nextLine();
  System.out.println("Enter the first index of substring: ");
  int x = sc.nextInt();
  System.out.println("Enter the second index of substring: ");
  int y = sc.nextInt();
  System.out.println("The required substring is: " + str.substring(x,y) + " \nWhich is of length: " + str.substring(x,y).length());
 } 
}
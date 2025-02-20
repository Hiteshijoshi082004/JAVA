// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
public class Halfdiamond {
  public static void main(String args[]){
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println(" Half Diamond Pattern");
    System.out.println("-------------------------");
    // USING SCANNER CLASS HERE
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) 
    {
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("* ");
        }
        System.out.println();
    }
  }
}

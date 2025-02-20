// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
public class Increasingnotriangle {
  public static void main(String args[]){
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Increasing Number Triangle Pattern");
    System.out.println("-------------------------");
    // USING SCANNER CLASS HERE
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    // NESTED FOR LOOP
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); 
    }
  }
}

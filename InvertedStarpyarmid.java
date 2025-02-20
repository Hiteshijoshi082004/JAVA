// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
public class InvertedStarpyarmid {
  public static void main(String args[]){
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println(" Inverted-Star Pyramid Pattern");
    System.out.println("-------------------------");
    // USING SCANNER CLASS HERE
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    // NESTED FOR LOOP
    for(int i = 0; i < n; i++){
        for(int j = 0; j< i; j++){
          System.out.print(" ");
        }
        for(int j = 0; j<2*n -(2*i +1);j++){
          System.out.print("*");
        }
        for(int j = 0; j<i; j++){
          System.out.print(" ");
        }
        System.out.println("");
      }
  }
}

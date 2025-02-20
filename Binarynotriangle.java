// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
public class Binarynotriangle {
  public static void main(String args[]){
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println(" Binary Number Triangle Pattern");
    System.out.println("-------------------------");
    // USING SCANNER CLASS HERE
    int n=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int N = sc.nextInt();
    for(int i = 0; i<N; i++){
      for(int j = 0; j<=i;j++){
        System.out.print(n);
        if (n==1) {
          n--;
        }
        else{
          n++;
        }
      } 
      System.out.println("");
    }
  }
}

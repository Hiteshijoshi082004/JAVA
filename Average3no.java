// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE
import java.util.Scanner;
public class Average3no 
{
    public static void main(String[] args){
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Average of Three Numbers");
        System.out.println("-------------------------");     
        Scanner sc = new Scanner(System.in);
        //  FIRST NO
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        // SECOND NO
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        // THIRD NO
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        // PRINTING AVG OF THREE NUMBERS
        System.out.println("The average of "+a+" "+b+" "+c+" "+ "is: " + avgThreeNum(a, b, c));
    }
        // MADE A FUNCTION avgThreeNum IN WHICH CALCULATING AVG OF 3 NUMBERS
    public static float avgThreeNum(int a, int b, int c)
    {
        float avg = ((float)a + (float)b + (float)c)/3;
        return avg;
    }
 }
 
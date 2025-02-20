// // IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
class Invertedrightangle{
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Inverted-Right-Angled Triangle Star Pattern");
        System.out.println("-------------------------");
        // USING SCANNER CLASS HERE 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = in.nextInt();
        // NESTED FOR LOOP
        for(int i = n; i >= 0 ; i--){
            for (int j = 1 ; j < i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}


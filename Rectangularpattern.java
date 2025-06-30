// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
class Rectangularpattern {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Rectangular Star Pattern");
        System.out.println("-------------------------");
        // USING SCANNER CLASS HERE 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = in.nextInt();
        // NESTED FOR LOOP
        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

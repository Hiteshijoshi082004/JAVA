// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
public class Invertednopyramid {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Inverted-Numbered Pyramid Pattern");
        System.out.println("-------------------------");
        // USING SCANNER CLASS HERE 
        int no=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = in.nextInt();
        // NESTED FOR LOOP
        for(int i = n; i >= 0; i--){
            for (int j = 0 ; j < i; j++){
                System.out.print(no);
                no++;
            }
            System.out.println(no);
            no=1;
        }
    }
}
